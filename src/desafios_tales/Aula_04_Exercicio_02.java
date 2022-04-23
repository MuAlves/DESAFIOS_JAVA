/*
 *Exercício 2
Qual é o resultado após a execução do seguinte trecho de código?
 */
package desafios_tales;

/**
 *
 * @author muril
 */
public class Aula_04_Exercicio_02 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("AAA").insert(1, "BB").insert(4, "CCC");
        System.out.println(sb);

    }
}
