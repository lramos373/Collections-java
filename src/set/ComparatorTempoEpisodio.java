package set;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int tempo =s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if( tempo!= 0) return tempo;

        return CharSequence.compare(s1.getGenero(),s2.getGenero());

    }
}
