package códigos;

import javax.swing.JOptionPane;

import classe.Aluno;

public class ClasseExecutora {
	
	public static void main (String[] args) {


		String nome = JOptionPane.showInputDialog("Qual o nome do aluno ?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno ?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
		String nomepai = JOptionPane.showInputDialog("Qual o nome do pai do aluno ?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a série em que o aluno está matriculado ?");
		String nota1 = JOptionPane.showInputDialog("nota1");
		String nota2 = JOptionPane.showInputDialog("nota2");
		String nota3 = JOptionPane.showInputDialog("nota3");
		String nota4 = JOptionPane.showInputDialog("nota4");
		
		
		
		// Aluno() == Instância, uma criação de um objt
		// aluno 1 é uma referência para o objt Aluno
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setCpf(cpf);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomepai(nomepai);
		aluno1.setSerieMatriculado(serieMatriculado);
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		// ===========================================================================================================//
		System.out.println("Segue abaixo os dados dos seguntes alunos:");
		System.out.println(" aluno1:");
		System.out.println("  NOME do aluno é = " + aluno1.getNome());
		System.out.println("  CPF = " + aluno1.getCpf());
		System.out.println("  DATA/NASCIMENTO = " + aluno1.getDataNascimento());
		System.out.println("  NOME DA MÃE = " + aluno1.getNomeMae());
		System.out.println("  NOME DO PAI = " + aluno1.getNomepai());
		System.out.println("  SERIE/MATRICULADO = " + aluno1.getSerieMatriculado());
		
		System.out.println("  SERIE/MATRICULADO = " + aluno1.getSerieMatriculado());
		
	
	}

		
}
