package com.amanda.cursojava.aula24.labs;

import java.util.Date;

/*Usando o resultado do modelo "Livro" como base, crie uma classe "Livro de Biblioteca" que represente os dados
 * básicos de um livro de uma biblioteca, que pode ser emprestado a leitores*/

public class Exercicio04 {
	   public static void main(String[] args){
	        
	        LivroBiblioteca livro = new LivroBiblioteca();
	        
	        livro.nome = "Mastering ExtJS";
	        livro.autor = "Loiane Groner";
	        livro.anoLancamento = 2015;
	        
	        livro.emprestado = true;
	        livro.dataEntrega = new Date();
	        livro.emprestadoA = "Loiane";
	        
	        System.out.println("Nome do livro = " + livro.nome);
	    }

}
