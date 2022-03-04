package com.amanda.cursojava.aula34.labs;

/*Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado sempre que a classe for 
 * instanciada. Crie métodos para zerar, incrementar e retornar o valor do contador. Desenvolva um programa
 * para testar essa classe*/

public class Exercicio01 {
	public static void main(String[] args) {
		Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		
		System.out.println(Contador.obterValor());
		Contador.zerar();
		System.out.println(Contador.obterValor());
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		System.out.println(Contador.obterValor());

	}

}
