/*
 Faça um programa que leia três notas de um aluno, calcule sua média aritmética e imprima uma mensagem dizendo se o aluno foi aprovado,
reprovado ou deverá fazer prova final. O critério de aprovação é o seguinte: aprovado (média > 7); reprovado (média < 3) 
e prova final ( 3 < média < 7).
 */
package att5tres;

import java.util.Scanner;

public class Att5tres {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextDouble();

        media = (n1 + n2 + n3) / 3;
        if (media >= 7) {
            System.out.println("Aprovado com media: " +media);
        } else if (media >= 3) {
            System.out.println("Prova final, com media: " +media);
        }else System.out.println("Reprovado com media: " +media);
    }

}
