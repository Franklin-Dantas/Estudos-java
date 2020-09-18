package attdois;

import java.util.Scanner;

public class Attdois {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3, soma, sub;

        System.out.println("Digite numero 1: ");
        n1 = ler.nextDouble();
        System.out.println("Digite numero 2: ");
        n2 = ler.nextDouble();
       
        soma = n1 + n2;
       
        System.out.println("Digite numero 3: ");
        n3 = ler.nextDouble();
        
        sub = soma - n3;    
        System.out.println("O valor que ficou foi = " + sub);
    }

}
