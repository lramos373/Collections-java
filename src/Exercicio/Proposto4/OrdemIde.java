package Exercicio.Proposto4;

import java.util.Comparator;

public class OrdemIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int next = CharSequence.compare(l1.getIde(), l2.getIde());
        if (next != 0) return next;
        return Integer.compare(l1.getAnoDeCriação(), l2.getAnoDeCriação());
    }
}
