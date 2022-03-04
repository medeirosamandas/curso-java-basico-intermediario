package com.amanda.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua idade");
		
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("É maior de idade");
		}
		else {
			System.out.println("Não é maior de idade");
		}
		
		// barato <= 10
		// 10 < valor < 15 - pedir desconto
		// 15 <= valor
		
		System.out.println("Entre com o preço do item");
		int valor = sc.nextInt();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		}else { // valor >= 17
			System.out.println("Muito caro");
		}
	}

}
