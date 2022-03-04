package com.amanda.cursojava.aula24.labs;

/*Usando o resultado do exercício anterior como base, crie uma classe "Livro de Livraria" que representeos dados
 * básicos de um livro que está à venda em uma livraria*/

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
