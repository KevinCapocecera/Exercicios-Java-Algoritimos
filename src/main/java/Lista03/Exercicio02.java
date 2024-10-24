package Lista03;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int ano = sc.nextInt();
        var anoAtual = new Date(); /*Criando uma variavel do tipo Date*/
        var calendar = new GregorianCalendar(); /*Especificando o calendário gregoriano*/
        calendar.setTime(anoAtual); /*Definindo o ano atual*/


        if((calendar.get(Calendar.YEAR) - ano) >= 16){
            System.out.println("Voce pode votar");
        }else{
            System.out.println("Voce ainda nao pode votar");
        }


    }
}
