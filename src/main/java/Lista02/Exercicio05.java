package Lista02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            resultado += num;
        }
        System.out.println("A soma dos 10 valores digitados é: " + resultado);
    }
}
