package com.amanda.cursojava.aula38;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	

		
	public Aluno() {
		super();
		
		// pode ser usado tanto a palavra super quanto this para os atributos de pessoa, j� que a classe
		// Aluno extende de Pessoa
		super.setNome("Amanda");
		this.setNome("Maria");
	}
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		
		this.curso = curso;

	}


	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia(){
		return 0;
	}
	
	public boolean verificarAprovado(){
		return true;
	}

}
