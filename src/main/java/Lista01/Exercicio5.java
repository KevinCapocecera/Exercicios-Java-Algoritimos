package Lista01;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para exibir o seu fatorial: ");

        int num = sc.nextInt();

        for(int i = num; i > 1; i-- ){
            num = num * (i - 1);
        }
        System.out.println(num);


    }
}
