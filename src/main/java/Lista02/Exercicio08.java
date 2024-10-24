package Lista02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagemPessoas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a idade de 20 pessoas: ");
            int idade = sc.nextInt();

            if (idade>=18) {
            contagemPessoas += 1;
            } else {
                contagemPessoas += 0;
            }
        }
        System.out.println("A quantidade de pessoas com mais de 18 anos e: " + contagemPessoas);
    }
}
