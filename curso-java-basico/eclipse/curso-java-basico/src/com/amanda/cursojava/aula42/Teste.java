package com.amanda.cursojava.aula42;

public class Teste {
	
	public static void main(String[] args) {
	
		
		
		Pessoa pessoa = new Pessoa();
		
		// n�o � poss�vel os dois exemplos abaixo, pois a classe pessoa n�o extende mais
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		final String valorImutavel = "Amanda";
		
		
		// valorImutavel = "Amandinha";
	}
	
	

}
