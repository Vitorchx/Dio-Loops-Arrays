package loops;

/*
Desenvolva um gerador de tabuada,
caáz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuario deve informar de qual nú ele deseja ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
*/

import java.util.Scanner;

public class Ex_5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for( int i = 1; i <= 10 ; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));


        }

    }

}
