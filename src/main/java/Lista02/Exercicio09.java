package Lista02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        String nomeMenor = "";
        int idade = 0;
        int idadeMenor = Integer.MAX_VALUE; /* MAX_VALUE é o valor maximo de um inteiro por isso foi colocado para restringir a idade.*/


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome: ");
            nome = sc.next();
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
            if (idade < idadeMenor){
                nomeMenor = nome;
                idadeMenor = idade;
            }

        }
        System.out.println("A pessoa mais nova é: " + nomeMenor);
    }
}
