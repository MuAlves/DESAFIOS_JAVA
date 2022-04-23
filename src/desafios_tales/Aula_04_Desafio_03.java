/*
Desafio 3
Crie um programa que exiba a tabuada de um número informado pelo usuário.
 */
package desafios_tales;

import java.util.Scanner;

/**
 *
 * @author muril
 */
public class Aula_04_Desafio_03 {

    public static void main(String[] args) {

        int valor;

        Scanner inputData = new Scanner(System.in);
        System.out.println("Programa que executa a tabuada, conforme o numero digitado!");
        System.out.println("Digite um numero para calculo da tabuada: ");
        valor = inputData.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.println(valor + " X " + i + " = " + (valor * i));

        }

    }
}
