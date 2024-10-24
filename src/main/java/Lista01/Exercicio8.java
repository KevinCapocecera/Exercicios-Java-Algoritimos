package Lista01;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de eleitores que votaram em branco");
        int votosBrancos = sc.nextInt();

        System.out.println("Digite a quantidade de eleitores que votaram nulo");
        int votosNulos = sc.nextInt();

        System.out.println("Digite a quantidade de eleitores que tiveram voto valido");
        int votosValidos = sc.nextInt();

        int eleitores = votosBrancos + votosNulos + votosValidos;

        int brancos = votosBrancos * 100 / eleitores;
        int nulos = votosNulos * 100 / eleitores;
        int validos = votosValidos * 100 / eleitores;

        System.out.println("Porcentagem de votos brancos: " + brancos + "%");
        System.out.println("Porcentagem de votos nulos: " + nulos + "%");
        System.out.println("Porcentagem de votos validos: " + validos + "%");

        System.out.println("A quantidade de eleitores e: " + eleitores);
    }
}
