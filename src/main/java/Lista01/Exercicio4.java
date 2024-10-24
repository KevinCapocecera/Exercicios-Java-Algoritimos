package Lista01;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = sc.nextInt();

        System.out.println("O que deseja fazer? 1- Media Aritimetica, 2- Media Ponderada");
        int opcao = sc.nextInt();

        Integer mediaAritimetica = (nota1 + nota2 + nota3) / 3;
        Integer mediaPonderada = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;

        if (opcao == 1){
            System.out.println(mediaAritimetica);
        } else if(opcao == 2){
            System.out.println(mediaPonderada);
        } else {
            System.out.println("Tem essa opcao Idiota?");
        }
    }
}
