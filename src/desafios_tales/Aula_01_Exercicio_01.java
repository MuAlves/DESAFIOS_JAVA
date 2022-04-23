/*
Exercício 1
Crie um programa que imprima seu nome e um numero aleatório de 0 a 10.nd open the template in the editor.
 */
package desafios_tales;

import java.util.Random;

public class Aula_01_Exercicio_01 {

    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();
        System.out.println("Murilo");
        System.out.println("Numero: " + r.nextInt(11));

    }

}
