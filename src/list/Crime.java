package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class Crime {
    public static void main(String[] args) {
        String[] perguntas = {"Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"};

        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        String resposta;

        for (int i = 0; i < 5; i++){
            System.out.println(perguntas[i]);
            resposta = scan.nextLine();
            respostas.add(resposta);
        }
        int count = 0;
        for ( String repostaChar:respostas ) {
            if (repostaChar.equalsIgnoreCase("sim") |
                    repostaChar.equalsIgnoreCase("s"))
            {
                count++;
            }
        }

        switch (count){
            case 2:
            System.out.println("Suspeita");
            break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assasina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
}
