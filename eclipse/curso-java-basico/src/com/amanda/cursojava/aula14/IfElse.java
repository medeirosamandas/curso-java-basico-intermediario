package com.amanda.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua idade");
		
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("� maior de idade");
		}
		else {
			System.out.println("N�o � maior de idade");
		}
		
		// barato <= 10
		// 10 < valor < 15 - pedir desconto
		// 15 <= valor
		
		System.out.println("Entre com o pre�o do item");
		int valor = sc.nextInt();
		
		if (valor <= 10) {
			System.out.println("Est� barato, pode comprar");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Voc� pode pedir um desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		}else { // valor >= 17
			System.out.println("Muito caro");
		}
	}

}
