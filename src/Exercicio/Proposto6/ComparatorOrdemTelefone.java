package Exercicio.Proposto6;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class ComparatorOrdemTelefone implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> n1, Map.Entry<Integer, Contato> n2) {
        return n1.getValue().getNumero().compareTo(n2.getValue().getNumero());
    }
}
