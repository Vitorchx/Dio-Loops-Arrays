package loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex_3MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;

        int soma = 0;

        int maior = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;



            if (numero > maior ) maior = numero;


            count = count + 1;
        } while(count < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + (soma / 5));




    }

}
