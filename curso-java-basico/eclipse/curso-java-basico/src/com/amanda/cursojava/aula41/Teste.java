package com.amanda.cursojava.aula41;

public class Teste {
	
	public static void main(String[] args) {
	
		
		
		// d� erro ao tentar instanciar a classe pessoa
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		
		// quando quiser que todas as classes filhas tenham um m�todo, � s� declar�-la tamb�m como abstract
		// assim que declarar um m�todo abstract TODAS as classes filhas ser�o obrigadas a incluir o m�todo na pr�pria classe
		//	public abstract String obterEtiquetaEndereco();

		aluno.setEndereco("Rua 2, numero 1");
		professor.setEndereco("Rua 3, numero 1");
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}
	
	

}
