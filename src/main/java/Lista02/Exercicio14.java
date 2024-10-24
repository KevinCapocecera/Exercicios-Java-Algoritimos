package Lista02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int contagem0a100 = 0;
        int contagem101a200 = 0;
        int contagem201max = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            num = sc.nextInt();

            if (num > 0 && num <= 100){
                contagem0a100++;
            } else if (num > 100 && num <= 200){
                contagem101a200++;
            } else if (num > 200){
                contagem201max++;
            }
        }

        System.out.println("Quantidade de numeros entre 0 e 100: " + contagem0a100);
        System.out.println("Quantidade de numeros entre 101 e 200: " + contagem101a200);
        System.out.println("Quantidade de numeros maior que 200: " + contagem201max);
    }
}
