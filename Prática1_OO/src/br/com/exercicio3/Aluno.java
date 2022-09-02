package br.com.exercicio3;

	public class Aluno {
		private String nome;
		private int matricula;
		private float notaAV1,notaAV2,notaAE;
		private String curso;
		private int periodo;
	
	//ctrl+3 => gcuf => para novo construtor
	
	public Aluno(String nome, int matricula, float notaAV1, float notaAV2, float notaAE, String curso, int periodo) {
		//super é superior
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.periodo = periodo;
	}
	public void alteranotaAV1(float nota){
		this.notaAV1 = nota;
	}
	public void alteranotaAV2(float nota){
		this.notaAV2 = nota;
	}
	public void alteranotaAE(float nota){
		this.notaAE = nota;
	}
	public String avaliaraluno() {
		if((this.notaAV1+this.notaAV2)>=60)
			return "Aprovado";
		else 
			return "Recuperacao";
				
	}
	public String avaliarrecuperacao() {
		if((this.notaAV1+this.notaAV2+this.notaAE)/2>=60)
			return "Aprovado";
		else
			return "Reprovado";
	}
	
}
	
