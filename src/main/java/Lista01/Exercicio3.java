package Lista01;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade em anos, meses e dias: ");

        int idade = sc.nextInt();
        int meses = sc.nextInt();
        int dias = sc.nextInt();
        int total = (idade * 365) + (meses * 30) + dias;
        System.out.println("Sua idade em dias é: " + total);




    }
}
