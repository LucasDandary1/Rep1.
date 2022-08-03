package codigos.exeutaveis;

import classes.Aluno;

public class GeterSeter {

	public static void main(String[] args) {

		// Aluno() == Instância, uma criação de um objt
		// aluno 1 é uma referência para o objt Aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Lucas Dandary de Paula Ferreira");
		aluno1.setCpf("022.274.716-11");
		aluno1.setDataNascimento("23/09/2001");
		aluno1.setIdade(20);
		aluno1.setNomeMae("Teonélia Juvenila de Paula");
		aluno1.setNomepai("Deivison Nelson Ferreira");
		aluno1.setSerieMatriculado("3 ano do Ensino Médio");
		aluno1.setNota1(20.9);
		aluno1.setNota2(59.4);
		aluno1.setNota3(45.8);
		aluno1.setNota4(80.9);
		
		
		//===========================================================//
		System.out.println("Segue abaixo os dados dos seguntes alunos:");
		System.out.println(" aluno1:");
		System.out.println("  NOME = " + aluno1.getNome());
		System.out.println("  CPF = " + aluno1.getCpf());
		System.out.println("  DATA/NASCIMENTO = " + aluno1.getDataNascimento());
		System.out.println("  IDADE = " + aluno1.getIdade());
		System.out.println("  NOME DA MÃE = " + aluno1.getNomeMae());
		System.out.println("  NOME DO PAI = " + aluno1.getNomepai());
		System.out.println("  SERIE/MATRICULADO = " + aluno1.getSerieMatriculado());

		System.out.println(""
				+ "");
		
		//=======================================================================================================================================================================
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Lyla de Paula Avelar");
		aluno2.setCpf("xxx.xxx.xxx-xx");
		aluno2.setDataNascimento("16/06/2006");
		aluno2.setIdade(18);
		aluno2.setNomeMae("Teonélia Juvenila de Paula");
		aluno2.setNomepai("Decio Avelar");
		aluno2.setSerieMatriculado("3 ano do Ensino Médio");
		aluno2.setNota1(23.9);
		aluno2.setNota2(23.5);
		aluno2.setNota3(89.9);
		aluno2.setNota4(67.8);
		
		System.out.println(" aluno2:");
		System.out.println("  NOME = " + aluno2.getNome());
		System.out.println("  CPF = " + aluno2.getCpf());
		System.out.println("  DATA/NASCIMENTO = " + aluno2.getDataNascimento());
		System.out.println("  IDADE = " + aluno2.getIdade());
		System.out.println("  NOME DA MÃE = " + aluno2.getNomeMae());
		System.out.println("  NOME DO PAI = " + aluno2.getNomepai());
		System.out.println("  SERIE/MATRICULADO = " + aluno2.getSerieMatriculado());
		
		System.out.println("=================================================================== ");
		System.out.println("A Média das notas dos alunos é:");
		
		
		
		System.out.println("aluno1: " + aluno1.getMediaNota());
		System.out.println("aluno2: " + aluno2.getMediaNota());
		
			
	}

}
