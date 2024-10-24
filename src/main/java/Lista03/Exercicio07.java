package Lista03;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados do poligono que voce deseja saber a area: ");
        int lados = sc.nextInt();
        System.out.println("Digite o valor de cada lado do poligono: ");
        double medidaLado = sc.nextDouble();

        for (int i = 1; i < lados; i++) {
            medidaLado = sc.nextDouble();
        }

        switch (lados) {
            case 3:
                System.out.println("Triangulo!");
                System.out.println("Area: " + (medidaLado * medidaLado) / 2);
                break;
            case 4:
                System.out.println("Quadrado!");
                System.out.println("Area: " + (medidaLado * medidaLado));
                break;
            case 5:
                System.out.println("Pentagono!");
                break;
            default:
                System.out.println("Nao sei o que voce deseja saber a area!");
        }

    }
}
