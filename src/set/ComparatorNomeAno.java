package set;

import java.util.Comparator;

public class ComparatorNomeAno implements Comparator<LinguagensFavoritas>{
    @Override
    public int compare(LinguagensFavoritas l1, LinguagensFavoritas l2) {
        int ano = l1.getAnoDeCriacao().compareToIgnoreCase(l2.getAnoDeCriacao());
        if (ano != 0)return ano;

        int nome = l1.getNome().compareTo(l2.getNome());
        return nome;
    }
}
