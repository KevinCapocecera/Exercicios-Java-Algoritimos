package Lista03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        if (num > num2) {
            System.out.println("O maior numero digitado foi: " + num);
        } else if (num2 > num) {
            System.out.println("O maior numero digitado foi: " + num2);
        } else{
            System.out.println("Os numeros digitados sao iguais");
        }

    }
}
