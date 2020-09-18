package att2;

import java.util.Scanner;

/**
 *
 * @author Franklin
 */
public class Att2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3, n4, media, prod;

        System.out.println("Digite nota 1: ");
        n1 = ler.nextDouble();
        System.out.println("Digite nota 2: ");
        n2 = ler.nextDouble();
        System.out.println("Digite nota 3: ");
        n3 = ler.nextDouble();
        System.out.println("Digite nota 4: ");
        n4 = ler.nextDouble();
        media = (n1 + n2 + n3 + n4) / 4;
        prod = (n1 + n2 + n3 + n4) * 4;
        System.out.println("A media das notas foram = " + media);
        System.out.println("A produto das notas foram = " + prod);
    }

}
