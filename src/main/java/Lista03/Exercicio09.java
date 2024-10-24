package Lista03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as medidas dos lados do triangulo: ");
        int medida1 = sc.nextInt();
        int medida2 = sc.nextInt();
        int medida3 = sc.nextInt();

        if (medida1 == medida2 && medida2 == medida3) {
            System.out.println("Triangulo Equilatero");
        }else if(medida1 == medida2 || medida1 == medida3 || medida2 == medida3){
            System.out.println("Triangulo Isosceles");
        }else{
            System.out.println("Triangulo Escaleno");
        }

    }
}
