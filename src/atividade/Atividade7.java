/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add(JOptionPane.showInputDialog("Digite o 1º nome:"));
        listaNomes.add(JOptionPane.showInputDialog("Digite o 2º nome:"));
        listaNomes.add(JOptionPane.showInputDialog("Digite o 3º nome:"));

        Collections.sort(listaNomes);

        JOptionPane.showMessageDialog(null, listaNomes);

    }
    
}
