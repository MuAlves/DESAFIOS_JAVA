/*
Exercício 3

• Elabore um algoritmo para calcular o IMC de uma pessoa.

• Pergunte qual é a altura (m) da pessoa e qual é o peso da pessoa (Kg).

• Ao final mostre o IMC calculado.

 */
package desafios_tales;

import java.util.Scanner;

/**
 *
 * @author muril
 */
public class Aula_03_Exercicio_03 {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.println("PROGRAMA PARA CALCULAR O IMC! ");
        System.out.println("Digite sua Altura: ");
        float altura = inputData.nextFloat();

        System.out.println("Digite Seu peso(KG): ");
        float peso = inputData.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC é de: " + imc);

    }

}
