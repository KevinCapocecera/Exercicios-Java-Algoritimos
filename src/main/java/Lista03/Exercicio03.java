package Lista03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 1234;

        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();

        while (senha != senhaCorreta) {
            System.out.println();
            System.out.println("Acesso Negado. Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");
    }
}
