package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Mel", 10, "Laranja"));
            add(new Gato("Herbys", 12, "Marrom"));
            add(new Gato("Mel", 5, "Branca"));

        }};
        //embaralha a lista
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //ordem natural da lista
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    //compareTo retorna int, compara formato de dicionario, lexicograficamente;
    // retorna positivo se segue, negativo se precede, 0 se strings são iguais;
    //equals retorna booleano;

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}