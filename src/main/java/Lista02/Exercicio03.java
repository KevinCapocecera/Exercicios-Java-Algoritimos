package Lista02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        for (int i = 0; i <= 10; i++) {
            System.out.println(nome);
        }
    }
}
