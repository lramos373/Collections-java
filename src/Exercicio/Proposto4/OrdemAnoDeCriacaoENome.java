package Exercicio.Proposto4;

import java.util.Comparator;

public class OrdemAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
       int next = Integer.compare(o1.getAnoDeCriação(),o2.getAnoDeCriação());
       if ( next!=0)return next;

        return CharSequence.compare(o1.getNome(),o2.getNome());
    }
}
