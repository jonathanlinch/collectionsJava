package list;

import java.util.*;

public class ExemploList_1 {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as 7 notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(5.0);
        notas.add(2.9);
        notas.add(6.0);
        notas.add(4.8);
        notas.add(7.0);
        notas.add(7.5);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set((notas.indexOf(5d)),6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        for ( Double nota : notas ) {
            System.out.println(nota);
        }
    }
}
