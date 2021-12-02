package loops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
EX: 5!= 120
 */

import java.util.Scanner;

public class Ex_6Fatorial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");

        for ( int i = fatorial; i >= 1 ; i--) {
            multiplicacao = multiplicacao * i;


        }

        System.out.println(multiplicacao);

    }


}
