package br.com.exercicio3;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Lucas",536,30,20,0,"ADS",3);
		System.out.println(aluno1.avaliaraluno());
		System.out.println(aluno1.avaliarrecuperacao());
		aluno1.alteranotaAE(70);
		System.out.println("Alterar nota da Prova Especial");
		System.out.println(aluno1.avaliarrecuperacao());
	}
	

}
