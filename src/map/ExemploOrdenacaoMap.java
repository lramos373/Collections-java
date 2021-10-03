package map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("---\t Ordem aleatoria\t---");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve HIstoria do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licões para o seculo 21", 432));

        }};
        for (Map.Entry<String, Livro> livros : meusLivros.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("---\t Ordem de Inserção\t---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve HIstoria do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licões para o seculo 21", 432));

        }};
        for (Map.Entry<String, Livro> livros : meusLivros1.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        System.out.println("---\t Ordem Alfabetica dos Autores \t---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livros : meusLivros2.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("---\t Ordem Alfabetica dos Livros \t---");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new CompareNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livros : meusLivros2.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("---\t Ordem crescente do numero de paginas \t---");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparePagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livros : meusLivros4)
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome()+ " - "
                    + livros.getValue().getPaginas()+"  paginas");
    }


}
