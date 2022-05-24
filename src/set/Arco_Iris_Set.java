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
        Set<String> coresInversas = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresInversas);
        List<String> listCores = new ArrayList<>(coresInversas);
        Collections.reverse(listCores);
        System.out.println(listCores);

        System.out.println("\"Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor:arco_iris) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("\"Remova todas as cores que não começam com a letra ”v”: ");
        Iterator<String> iterator = arco_iris.iterator();
        while(iterator.hasNext()){
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(arco_iris);

        System.out.println("Limpe o conjunto");
        arco_iris.clear();
        System.out.println(arco_iris);
    }
}
