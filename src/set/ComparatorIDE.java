package set;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagensFavoritas> {
    @Override
    public int compare(LinguagensFavoritas l1, LinguagensFavoritas l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}
