package loops;

import java.util.Scanner;


/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma menssagem caso o valor seja invalido
e continue pedindo até que o usuário informe um valor valido.
*/

public class Ex_2Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota invalida! Digite novamente: ");
            nota = scan.nextInt();

        }
    }



}
