package Lista02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int contagem = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero: ");
            num = sc.nextInt();

            if(num > 8){
                contagem++;
            }
        }
        System.out.println("Quantidade de numeros maiores que 8: " + contagem);
    }
}
