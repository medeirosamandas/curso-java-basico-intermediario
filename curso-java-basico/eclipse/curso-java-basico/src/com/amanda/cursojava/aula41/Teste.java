package com.amanda.cursojava.aula41;

public class Teste {
	
	public static void main(String[] args) {
	
		
		
		// dá erro ao tentar instanciar a classe pessoa
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		
		// quando quiser que todas as classes filhas tenham um método, é só declará-la também como abstract
		// assim que declarar um método abstract TODAS as classes filhas serão obrigadas a incluir o método na própria classe
		//	public abstract String obterEtiquetaEndereco();

		aluno.setEndereco("Rua 2, numero 1");
		professor.setEndereco("Rua 3, numero 1");
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}
	
	

}
