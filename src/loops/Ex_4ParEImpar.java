package loops;

/*
Faça um progrema que peça N números inteiros,
calcule e ostre a quantidade de números pares
e a quantidade der números impares.
*/

import java.util.Scanner;

public class Ex_4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qunatNUmeros;
        int numero;
        int quantPares = 0 , quantImpares = 0;

        System.out.println("Quantidade de números: ");
        qunatNUmeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Números: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;

            count = count + 1;

        } while (count < qunatNUmeros);

        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidade Impar:" + quantImpares);


    }

}
