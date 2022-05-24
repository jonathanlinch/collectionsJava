package list;

import set.Serie;

import java.util.Comparator;

public class ComparatorTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int tempo = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if (tempo != 0) return tempo;
        return s1.getGenero().compareToIgnoreCase(s2.getGenero());
    }
}
