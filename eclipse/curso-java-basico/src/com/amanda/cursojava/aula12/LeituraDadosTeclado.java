package com.amanda.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = sc.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = sc.next();
		System.out.println("Seu primeiro nome �: ");
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Sua idade �: ");
		
		System.out.println("Digite a sua altura: ");
		double altura = sc.nextDouble();
		System.out.println("Sua altura �: "); */
		
		// fazendo a leitura de v�rias vari�veis em uma �nica linha
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem um bichinho de estima��o: ");
		String nome = sc.next();
		int idadee = sc.nextInt();
		byte qtdFilhos = sc.nextByte();
		float alturaa = sc.nextFloat();
		boolean temPet = sc.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idadee);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + alturaa);
		System.out.println("Tem pet: " + temPet);
	}

}
