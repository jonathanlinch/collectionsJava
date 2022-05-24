package set;

import java.util.Objects;

public class LinguagensFavoritas implements Comparable<LinguagensFavoritas> {
    String nome;
    String anoDeCriacao;
    String ide;

    public String getNome() {
        return nome;
    }

    public String getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public LinguagensFavoritas(String nome, String anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagensFavoritas that = (LinguagensFavoritas) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "Nome = " + nome +
                ", Ano De Criacao = " + anoDeCriacao +
                ", IDE = " + ide +
                '}';
    }

    @Override
    public int compareTo(LinguagensFavoritas l) {
        return this.getNome().compareTo(l.getNome());
    }
}
