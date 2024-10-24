package Lista02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdade = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade de 20 pessoas: ");
            int idade = sc.nextInt();
            somaIdade += idade;
        }
        System.out.println("A soma da idade das 20 pessoas é: " + somaIdade);
    }
}
