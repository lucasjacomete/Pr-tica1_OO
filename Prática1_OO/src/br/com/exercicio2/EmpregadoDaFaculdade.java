package br.com.exercicio2;

	public class EmpregadoDaFaculdade{
	private String nome;
	private double salario;
	private int horasAula;

	EmpregadoDaFaculdade(String nome,double salario,int horasAula){
		this.nome=nome;
		this.salario=salario;
		this.horasAula=horasAula;
	}
	
	double getGastos() {
	double bonus;
	
		bonus=40*horasAula;
	
	return this.salario + bonus;
	}
	String getInfo(){
		
return "nome: " + this.nome + " com salário " + this.getGastos();
}
}	
