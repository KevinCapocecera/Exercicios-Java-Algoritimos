package Lista01;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero diferente de 0: ");

        Integer numero = sc.nextInt();


        if(numero > 0){
            System.out.println("O numero " + numero + " é positivo");
        } else if(numero < 0){
            System.out.println("O numero " + numero + " é negativo");
        }else {
            System.out.println("Não entendeu que é diferente de 0 Burro?");
        }

    }
}
