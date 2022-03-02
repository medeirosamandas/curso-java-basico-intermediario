package com.amanda.cursojava.aula45;

public class Teste {
	
	public static void main(String[] args) {
		
		// upcasting
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; 
		
		Pessoa aluno1 = new Aluno();
		// é o mesmo que
		Pessoa aluno2 = (Pessoa) new Aluno();
		
		// downcasting
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3;
		
		
		/*Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno();
		
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 =  (Aluno) aluno3;*/
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno5 = new Aluno();
		Professor prof = new Professor();
		
		if (pessoa instanceof Pessoa){
			System.out.println("é do tipo Pessoa");
		}
		
		if (aluno5 instanceof Aluno){
			System.out.println("é do tipo Aluno");
		}
		
		if (prof instanceof Professor){
			System.out.println("é do tipo Professor");
		}
	}

}
