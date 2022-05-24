package set;

import java.util.*;

/*
 vermelha, laranja, amarela, verde, azul, azul-escuro e violeta*/

public class Arco_Iris_Set{

    public static void main(String[] args) {
        Set<String> arco_iris = new HashSet<>(){{
            add("violeta");
            add("azul-escuro");
            add("azul");
            add("verde");
            add("amarela");
            add("laranja");
            add("vermelha");
        }};

        System.out.println("\t---Cores do arco-irís---\t");
        for (String cor:arco_iris) System.out.println(cor);

        System.out.println("\t---Quantidade de cores---\t");
        System.out.println(arco_iris.size());

        System.out.println("\t---Ordem alfabética---\t");
        Set<String> cores = new TreeSet<>(arco_iris);
        cores.addAll(arco_iris);
        for ( String cor:cores) {
            System.out.println(cor);
        }

        System.out.println("\t---Ordem inversa---\t");

    }
}
