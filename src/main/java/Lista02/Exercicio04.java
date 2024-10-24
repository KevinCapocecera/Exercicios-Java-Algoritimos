package Lista02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*Criação do Scanner*/
        Scanner sc = new Scanner(System.in);

        /*Atribuindo um valor para a variavel nome*/
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        /*Atribuindo um valor para a variavel vezes*/
        System.out.println("Digite a quantidade de vezes que quer repeti=lo:");
        int vezes = sc.nextInt();

        /*Imprime o nome repetido vezes*/
        for (int i = 0; i < vezes; i++) {
            System.out.println(nome);
        }


    }
}
