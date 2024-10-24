package Lista03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de maças que deseja comprar");
        int qtdCompra = sc.nextInt();
        double total = 0.0;

        if(qtdCompra > 12){
            total = qtdCompra * 0.25;
        } else {
            total = qtdCompra * 0.30;
        }
        System.out.println("O valor total a pagar e: " + total);
    }
}
