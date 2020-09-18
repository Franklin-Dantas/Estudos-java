/*
Ao viajar para o exterior, uma pessoa pode trazer no máximo 500 dólares em compras. Se o valor ultrapassar 500, 
ela deve pagar um imposto de 50% do valor que exceder os 500 dólares. Por exemplo, se um passageiro gastou 820 dólares, ele ultrapassou o 
limiteem 320 dólares, logo o imposto será de 50% em cima dos 320, ou seja, 160 dólares. Faça um programa que recebe o total gasto por um 
viajante e imprime o valor total a ser pago de imposto. Perceba que se o valor da compra for igual ou menor que 500, o valor de imposto será 0.
 */
package att5dois;

import java.util.Scanner;

public class Att5dois {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double gasto, excedente, imp;
        System.out.println("Digite o valor total gasto: ");
        gasto = ler.nextDouble();
        
        if (gasto > 500) {
            excedente = gasto - 500;
            imp = (excedente * 50) / 100;
            System.out.println("Valor pago em imposto: " + imp);
        }else{
            System.out.println("Não pagará imposto.");
        }
       


    }

}
