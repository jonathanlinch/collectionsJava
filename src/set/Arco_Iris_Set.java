package set;

import java.util.*;

/*
 vermelha, laranja, amarela, verde, azul, azul-escuro e violeta*/

public class Arco_Iris_Set{

    public static void main(String[] args) {
        Set<Cor> arco_iris = new HashSet<>(){{
            add(new Cor("violeta"));
            add(new Cor("azul-escuro"));
            add(new Cor("azul"));
            add(new Cor("verde"));
            add(new Cor("amarela"));
            add(new Cor("laranja"));
            add(new Cor("vermelha"));
        }};

        System.out.println("\t---Cores do arco-irís---\t");
        for (Cor cor:arco_iris) System.out.println(cor);

        System.out.println("\t---Quantidade de cores---\t");
        System.out.println(arco_iris.size());

        System.out.println("\t---Ordem alfabética---\t");
        Set<Cor> cores = new TreeSet<>(new ComparatorLetrasSet());
        cores.addAll(arco_iris);
        for ( Cor cor:cores) {
            System.out.println(cor.getCor());
        }

        System.out.println("\t---Ordem inversa---\t");


    }
}
