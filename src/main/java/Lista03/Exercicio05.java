package Lista03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num3 = sc.nextInt();
        int ordem1 = 0;
        int ordem2 = 0;
        int ordem3 = 0;

        if (num > num2 && num > num3) {
            ordem1 = num;
            if (num2 > num3) {
                ordem2 = num2;
                ordem3 = num3;
            } else {
                ordem2 = num3;
                ordem3 = num2;
            }
        } else if (num2 > num && num2 > num3) {
            ordem1 = num2;
            if (num > num3) {
                ordem2 = num;
                ordem3 = num3;
            } else {
                ordem2 = num3;
                ordem3 = num;
            }
        } else {
            ordem1 = num3;
            if (num > num2) {
                ordem2 = num;
                ordem3 = num2;
            } else {
                ordem2 = num2;
                ordem3 = num;
            }
        }

        System.out.println(ordem3 + " " + ordem2 + " " + ordem1);

    }
}
