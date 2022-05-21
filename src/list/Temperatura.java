package list;

import java.util.*;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> minhasMedias = new ArrayList<>();
        double media;

        for (int i = 0; i < 6; i++) {
            System.out.println();
            System.out.println("Digite a temperatura média:");
            media = scan.nextDouble();
            minhasMedias.add(media);
        }

        double soma = 0.0;
        for (Double next : minhasMedias) {
            soma += next;
        }

        double mediaTotal = soma / 6;
        System.out.format("Média geral do semestre: " + "%.2f" + "°C", mediaTotal);
        System.out.println();

        System.out.println("Temperaturas acima da média semestral");
        for ( Double temp:minhasMedias ) {
            if (temp > mediaTotal) {

                int index = minhasMedias.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}