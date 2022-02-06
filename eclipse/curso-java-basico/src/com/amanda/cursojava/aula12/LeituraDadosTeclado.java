package com.amanda.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = sc.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = sc.next();
		System.out.println("Seu primeiro nome é: ");
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Sua idade é: ");
		
		System.out.println("Digite a sua altura: ");
		double altura = sc.nextDouble();
		System.out.println("Sua altura é: "); */
		
		// fazendo a leitura de várias variáveis em uma única linha
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem um bichinho de estimação: ");
		String nome = sc.next();
		int idadee = sc.nextInt();
		byte qtdFilhos = sc.nextByte();
		float alturaa = sc.nextFloat();
		boolean temPet = sc.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idadee);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + alturaa);
		System.out.println("Tem pet: " + temPet);
	}

}
