package set;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Serie> {


    @Override
    public int compare(Serie s1, Serie s2) {
        return CharSequence.compare(s1.getGenero(),s2.getGenero());
    }
}