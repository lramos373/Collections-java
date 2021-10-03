package Exercicio.Proposto6;

import java.util.Comparator;
import java.util.Map;

public class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer,Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> n1, Map.Entry<Integer, Contato> n2) {
        return n1.getValue().getNome().compareTo(n2.getValue().getNome());
    }
}
