package map;

import java.util.Comparator;
import java.util.Map;

public class ComparePagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        int pagina = Integer.compare(l1.getValue().getPaginas(),l2.getValue().getPaginas());
        if( pagina!= 0) return pagina;

        return l1.getValue().getNome().compareTo(l2.getValue().getNome());

    }
}
