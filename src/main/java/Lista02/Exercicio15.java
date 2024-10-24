package Lista02;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int somaNum = 0;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        while (num > 0) {
           somaNum += num;
            System.out.println("Digite um numero: ");
            num = sc.nextInt();


        }

        System.out.println("Soma dos numeros positivos: " + somaNum);

    }
}
