package set;

import java.util.Objects;

public class Cor implements Comparable<String>{
    private final String cor;

    public Cor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cor cor1 = (Cor) o;
        return Objects.equals(cor, cor1.cor);
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    public String getCor() {
        return cor;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
