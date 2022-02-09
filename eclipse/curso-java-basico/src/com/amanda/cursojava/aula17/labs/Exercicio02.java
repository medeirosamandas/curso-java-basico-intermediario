package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha 
//igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Um usuário e senha");
		
		String user = sc.next();
		String password = sc.next();
		
		while(user.equals(password)) {
			System.out.println("Insira uma senha mais forte");
			System.out.println("O nome do usuário deve ser diferente da senha");
			user = sc.next();
			password = sc.next();
		}
		
		System.out.println("Cadastro efetuado com sucesso!");
	}

}
