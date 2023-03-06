/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é Par!");
        } else {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é Ímpar!");
        }

    }
}
