package set;

import java.util.Comparator;

public class ComparatorNomeAnoIDE implements Comparator<LinguagensFavoritas> {
    @Override
    public int compare(LinguagensFavoritas l1, LinguagensFavoritas l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;

        int ano = l1.getAnoDeCriacao().compareToIgnoreCase(l2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}
