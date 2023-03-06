
package atividade;

public class Aluno implements Comparable<Aluno> {

	String nome;
	Double nota1;
	Double nota2;

	public Double calculaMedia() {
			return (nota1 + nota2) / 2;
	}

	public String situacaoAluno() {
			if (calculaMedia() >= 6) {
					return "Aprovado!";
			} else {
					return "Reprovado!";
			}
	}

	@Override
	public String toString() {
			return nome + " - " + calculaMedia() + " - " + situacaoAluno() + "\n";
	}

	@Override
	public int compareTo(Aluno obj) {
			return nome.compareTo(obj.nome);
	}

}
