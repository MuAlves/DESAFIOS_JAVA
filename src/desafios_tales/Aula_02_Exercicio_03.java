/*
Desafio 1
• Crie um menu (modo texto) de uma aplicação voltada para consultório
médico.
• O menu terá 6 opções:
******************************
** MENU DE OPÇÕES **
* 1 - Inserir Paciente*
* 2 - Chamar o Paciente p/ ser atendido *
* 3 - Fila cheia ou vazia?*
* 4 - Próximo Paciente a ser atendido *
* 5 - Quantidade de Pacientes na fila*
* 6 - Sair *
******************************
Digite sua opção:
 */
package desafios_tales;

import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class Aula_02_Exercicio_03 {

    public static void main(String[] args) {

        String valor_digitado = JOptionPane.showInputDialog(null, "********************************************\n"
                + "**MENU DE INFORMAÇÕES**\n"
                + "*1 - Inserir Paciente*\n"
                + "*2 - Chamar o Paciente p/ ser atendido*\n"
                + "*3 - Fila cheia ou vazia?*\n"
                + "*4 - Próximo paciente a ser atendido*\n"
                + "*5 - Quantidade de pacientes na fila*\n"
                + "*6 - Sair*\n"
                + "********************************************\n"
                + "DIGITE SUA OPÇÃO ENTRE 1 ATÉ 6: ","Consultório Médico",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Opção digitada foi: " + valor_digitado);

    }
}
