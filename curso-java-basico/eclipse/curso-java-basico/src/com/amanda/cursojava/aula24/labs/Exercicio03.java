package com.amanda.cursojava.aula24.labs;

/*Usando o resultado do exerc�cio anterior como base, crie uma classe "Livro de Livraria" que representeos dados
 * b�sicos de um livro que est� � venda em uma livraria*/

public class Exercicio03 {
	   
    public static void main(String[] args){
        
        LivroLivraria livro = new LivroLivraria();
        
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 63.39;
        
        System.out.println("Nome do livro = " + livro.nome);
    }

}
