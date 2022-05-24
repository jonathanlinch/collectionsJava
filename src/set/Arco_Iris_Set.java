package set;

import java.util.HashSet;
import java.util.Set;
/*
 vermelha, laranja, amarela, verde, azul, azul-escuro e violeta*/

public class Arco_Iris_Set {
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

        for (String cores:arco_iris) System.out.println(cores);

    }
}
