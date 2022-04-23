/*
 Exercício 1
SOMADOR SEM ALTERAR DADOS OU COLETAR...

 */
package desafios_tales;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Aula_03_Exercicio_01 {

    public static void main(String[] args) {

        float numFloat1 = (float) 1.5;
        float numFloat2 = 3.7f;
        float somaFloat = numFloat1 + numFloat2;
        float subFloat = numFloat1 - numFloat2;
        float divFloat = numFloat1 / numFloat2;
        float multFloat = numFloat1 * numFloat2;
        float restFloat = numFloat1 % numFloat2;

        JOptionPane.showMessageDialog(null, "SOMA: " + somaFloat + "\n"
                + "Subtração: " + subFloat + "\n"
                + "Divisão: " + divFloat + "\n"
                + "Multiplicação: " + multFloat + "\n"
                + "Resto: " + restFloat + "\n");
    }
}
