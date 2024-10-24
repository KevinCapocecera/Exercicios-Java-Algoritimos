package Lista01;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double ipi = 0.03;
        int codigo1 = 1234;
        int codigo2 = 5678;
        double preco1 = 10.00;
        double preco2 = 20.00;

        System.out.println("Digite a quantidade do codigo1: ");
        int quantidade1 = sc.nextInt();

        System.out.println("Digite a quantidade do codigo2: ");
        int quantidade2 = sc.nextInt();

        double subTotal1 = preco1 * quantidade1;
        double subTotal2 = preco2 * quantidade2;
        double totalGeral = (subTotal1 + subTotal2) * (1 + ipi);

        System.out.println("Total geral: " + totalGeral);
    }
}
