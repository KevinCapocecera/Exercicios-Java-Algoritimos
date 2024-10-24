package Lista03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os angulos de um triangulo: ");
        int angulo1 = sc.nextInt();
        int angulo2 = sc.nextInt();
        int angulo3 = sc.nextInt();

        if(angulo1 + angulo2 + angulo3 != 180){
            System.out.println("Triangulo invalido");
        }else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90 ) {
            System.out.println("Triangulo retangulo");
        }else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
            System.out.println("Triangulo obtusangulo");
        }else{
            System.out.println("Triangulo acutangulo");
        }
    }
}
