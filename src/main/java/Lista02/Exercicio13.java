package Lista02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int contagem = 0;

        for(int i = 0; i < 20; i++) {
            System.out.println("Digite um numero: ");
            num = sc.nextInt();

            if (num > 0 && num < 100) {
                contagem++;
            }
        }

        System.out.println("Quantidade de numeros entre 0 e 100: " + contagem);
    }
}
