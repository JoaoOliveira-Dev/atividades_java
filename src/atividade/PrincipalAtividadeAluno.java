
package atividade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class PrincipalAtividadeAluno {

    public static void main(String[] args) {
        Integer quantidadeAlunos = Integer.parseInt(
                JOptionPane.showInputDialog("Quantos alunos tem a turma?"));

        List<Aluno> listaAlunos = new ArrayList<>();

        Double mediaTurma = 0d;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            Aluno alu = new Aluno();
            alu.nome = JOptionPane.showInputDialog("Digita o nome do " + i + "º aluno:");
            alu.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digita a nota 1 do " + i + "º aluno:"));
            alu.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digita a nota 2 do " + i + "º aluno:"));
            listaAlunos.add(alu);
            mediaTurma = mediaTurma + alu.calculaMedia();
        }

        Collections.sort(listaAlunos);
        JOptionPane.showMessageDialog(null, listaAlunos);

        mediaTurma = mediaTurma / quantidadeAlunos;
        JOptionPane.showMessageDialog(null, "A média da turma é " + mediaTurma + "!");

    }

}
