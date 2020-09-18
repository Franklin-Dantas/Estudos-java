/*
Faça um programa que leia 2 números e imprima uma mensagem dizendo o maior deles.
 */
package att5quatro;

import java.util.Scanner;

public class Att5quatro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double n1, n2;
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextDouble();
        
        if (n1 > n2){
            System.out.println("O primeiro numero é o maior");
        }else {
            System.out.println("O segundo numero é o maior");
        }
        
    }

}
