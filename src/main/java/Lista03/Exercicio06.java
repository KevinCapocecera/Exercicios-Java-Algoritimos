package Lista03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o sexo (1 para masculino e 2 para feminino): ");
        int sexo = sc.nextInt();

        if (sexo == 1){
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal eh: " + pesoIdeal);
        } else if (sexo == 2){
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal e: " + pesoIdeal);
        } else {
            System.out.println("Sexo invalido");
        }
    }
}
