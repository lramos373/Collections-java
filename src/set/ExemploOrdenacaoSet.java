package set;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhaSeries = new HashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70 show","comedia",25));

        }};
        for(Serie serie : minhaSeries) System.out.println(serie.getNome()+ " - "+ serie.getGenero() + " - "
        + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (Tempo Episodio) \t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhaSeries);
        for(Serie serie : minhasSeries2) System.out.println(serie.getNome()+ " - "+ serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Genero/Tempo Episodio \t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries2);
        for(Serie serie : minhasSeries3) System.out.println(serie.getNome()+ " - "+ serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Genero \t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries2);
          for(Serie serie : minhasSeries4) System.out.println(serie.getNome()+ " - "+ serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Tempo Episodio \t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries2);
        for(Serie serie : minhasSeries5) System.out.println(serie.getNome()+ " - "+ serie.getGenero() + " - "
                + serie.getTempoEpisodio());

    }

}




