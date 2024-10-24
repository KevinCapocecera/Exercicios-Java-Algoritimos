package Lista01;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        int resultado = 0;

        for(int i = 1; i <= num2 ; i++) {
            resultado = (resultado + num1);
        }
        System.out.println("O resultado é: " + resultado);
    }
}
