package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Linguagens_Set {
    public static void main(String[] args) {
        Set<LinguagensFavoritas> linguagens = new HashSet<>(){{
            add(new LinguagensFavoritas("Java", "1985", "Intellij"));
            add(new LinguagensFavoritas("Python", "1970","PyCharm"));
            add(new LinguagensFavoritas("JavaScript", "2000", "VS Code"));
        }};

        System.out.println("\t---Ordem de inserção---\t");
        Set<LinguagensFavoritas> linguagens1 = new LinkedHashSet<>(){{
            add(new LinguagensFavoritas("Java", "1985", "Intellij"));
            add(new LinguagensFavoritas("Python", "1970","PyCharm"));
            add(new LinguagensFavoritas("JavaScript", "2000", "VS Code"));
        }};
        for (LinguagensFavoritas l:linguagens1) System.out.println(l);

        System.out.println("\t---Ordem natural---\t");
        Set<LinguagensFavoritas> linguagens2 = new TreeSet<>(linguagens);
        for (LinguagensFavoritas l:linguagens2) System.out.println(l);

        System.out.println("\t---Ordem por IDE---\t");
        Set<LinguagensFavoritas> linguagens3 = new TreeSet<>(new ComparatorIDE());
        linguagens3.addAll(linguagens);
        for (LinguagensFavoritas l:linguagens3) {
            System.out.println(l);
        }

        System.out.println("\t---Ordem por ano de criação e nome---\t");
        Set<LinguagensFavoritas> linguagens4 = new TreeSet<>();
    }
}
