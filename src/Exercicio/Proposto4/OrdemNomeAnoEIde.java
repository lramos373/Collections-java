package Exercicio.Proposto4;

import java.util.Comparator;

public class OrdemNomeAnoEIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int next = CharSequence.compare(o1.getNome(),o2.getNome());
        if(next!=0)return next;
        int next2 = Integer.compare(o1.getAnoDeCriação(),o2.getAnoDeCriação());
        if ( next2 != 0)return next;
        return CharSequence.compare(o1.getIde(), o2.getIde());
    }
}
