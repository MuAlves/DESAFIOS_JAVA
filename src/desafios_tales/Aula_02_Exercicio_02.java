/*
Exercício 2 criar compos com icones e sem icones com o JOptionPane....
 */
package desafios_tales;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Aula_02_Exercicio_02 {

    public static void main(String[] args) {
        //Exibe uma mensagem de titulo SEM icone COM campo de escrita.
        JOptionPane.showInputDialog(null, "Mensagem sem: \nicone", "Titulo 01", JOptionPane.PLAIN_MESSAGE);

        //Exibe uma mensagem de titulo SEM icone SEM campo de escrita.
        JOptionPane.showMessageDialog(null, "Mensagem sem: \nicone", "Titulo 01", JOptionPane.PLAIN_MESSAGE);

        //Exibe uma mensagem de titulo COM icone e COM campo de escrita, ICONE DE ERRO.
        JOptionPane.showInputDialog(null, "Menasgem com icone de ERRO", "Titulo 02", JOptionPane.ERROR_MESSAGE);

        //Exibe uma mensagem de titulo COM icone e SEM campo de escrita, ICONE DE ERRO.
        JOptionPane.showMessageDialog(null, "Mensagem com icone de ERRO", "Titulo 02", JOptionPane.ERROR_MESSAGE);

        //Exibe uma mensagem de titulo COM icone e COM campo de escrita, ICONE DE INFORMAÇÃO.
        JOptionPane.showInputDialog(null, "Mensagem com icone de INFORMAÇÃO", "Titulo 03", JOptionPane.INFORMATION_MESSAGE);

        //Exibe uma mensagem de titulo COM icone e SEM campo de escrita, ICONE DE INFORMAÇÃO.
        JOptionPane.showMessageDialog(null, "Mensagem com icone de INFORMAÇÃO", "Titulo 03", JOptionPane.INFORMATION_MESSAGE);

        //Exibe uma mensagem de titulo COM icone e COM campo de escrita, ICONE DE WARNING.
        JOptionPane.showInputDialog(null, "Mensagem com icone de WARNING", "Titulo 04", JOptionPane.WARNING_MESSAGE);

        //Exibe uma mensagem de titulo COM icone e SEM campo de escrita, ICONE DE WARNING.
        JOptionPane.showMessageDialog(null, "Mensagem com icone de WARNING", "Titulo 04", JOptionPane.WARNING_MESSAGE);

        //Exibe uma mensagem de titulo COM icone e COM campo de escrita, ICONE DE QUESTION.
        JOptionPane.showInputDialog(null, "Mensagem com icone de QUESTION", "Titulo 05", JOptionPane.QUESTION_MESSAGE);

        //Exibe uma mensagem de titulo COM icone e SEM campo de escrita, ICONE DE QUESTION.
        JOptionPane.showMessageDialog(null, "Mensagem com icone de QUESTION", "Titulo 05", JOptionPane.QUESTION_MESSAGE);

    }
}
