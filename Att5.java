package att.pkg5;

import java.util.Scanner;

public class Att5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double hora;

        System.out.println("Digite a hora (formato 00.00): ");
        hora = ler.nextDouble();

        if (hora <= 0) {
            System.out.println("Digite um horario valido");

        } else if (hora < 5) {
            System.out.println("Esta escuro");

        } else if (5 <= hora && hora < 18) {
            System.out.println("Esta claro");

        } else if (hora <= 24) {
            System.out.println("Esta escuro");

        } else {
            System.out.println("Digite um horario valido");
        }

    }

}
