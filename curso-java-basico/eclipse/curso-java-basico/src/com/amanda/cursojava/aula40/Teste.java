package com.amanda.cursojava.aula40;

public class Teste {
	
	public static void main(String[] args) {
	
		
		// polimorfismo permite alterar 'override' o método da classe pai/mãe nas subclasses
		

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		// professor é do tipo Pessoa e com instância de Professor
		
		pessoa.setEndereco("Rua 1, numero 1");
		aluno.setEndereco("Rua 2, numero 1");
		professor.setEndereco("Rua 3, numero 1");
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}
	
	

}
