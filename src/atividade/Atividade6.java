package atividade;

import javax.swing.JOptionPane;

public class Atividade6 {
	
	public static void main(String[] args) {
    Integer n = Integer.parseInt(
			JOptionPane.showInputDialog("Qual número você deseja somar ?"));
		
		Integer soma = 0;

		for(Integer i = 1; i <= n; i++) {
			soma += i;
		}
		JOptionPane.showMessageDialog(null, "A soma dos números de 1 a " + n + " é: " + soma);
	}

}
