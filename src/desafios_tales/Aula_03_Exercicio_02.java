/*
 *Exercício 2

• Elabore um algoritmo para calcular a velocidade de três objetos diferentes (com
velocidade constante).

• Pergunte para cada objeto o valor da distância percorrida (m) e o tempo que
necessitou para percorrer essa distância (s).

• Mostre na tela o valor da velocidade (m/s) de cada objeto.

Velocidade = Distância / Tempo
 */
package desafios_tales;

import java.util.Scanner;

public class Aula_03_Exercicio_02 {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);
        System.out.println("Qual a distancia (M) percorrida por OBJETO 01: ");
        float distObjeto1 = inputData.nextFloat();

        System.out.println("Qual a distancia (M) percorrida por OBJETO 02: ");
        float distObjeto2 = inputData.nextFloat();

        System.out.println("Qual a distancia (M) percorrida por OBJETO 03: ");
        float distObjeto3 = inputData.nextFloat();

        System.out.println("Qual o tempo (S) gasto pelo OBJETO 01: ");
        float tempObejeto1 = inputData.nextFloat();

        System.out.println("Qual o tempo (S) gasto pelo OBJETO 02: ");
        float tempoObjeto2 = inputData.nextFloat();

        System.out.println("Qual o tempo (S) gasto pelo OBJETO 03: ");
        float tempoObjeto3 = inputData.nextFloat();

        float velObjeto1 = distObjeto1 / tempObejeto1;
        float velObjeto2 = distObjeto2 / tempoObjeto2;
        float velObjeto3 = distObjeto3 / tempoObjeto3;

        System.out.println("Velocidade do OBJETO 01 é: " + velObjeto1 + " m/s");
        System.out.println("Velocidade do OBJETO 02 é: " + velObjeto2 + " m/s");
        System.out.println("Velocidade do OBJETO 01 é: " + velObjeto3 + " m/s");

    }
}
