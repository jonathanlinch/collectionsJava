package set;

import java.util.Comparator;

public class ComparatorLetrasSet implements Comparator<Cor>{

    @Override
    public int compare(Cor cor1, Cor cor2) {
        return cor1.getCor().compareToIgnoreCase(cor2.getCor());
    }
}
