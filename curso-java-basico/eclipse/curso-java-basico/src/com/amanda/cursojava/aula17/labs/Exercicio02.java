package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

// Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha 
//igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Um usu�rio e senha");
		
		String user = sc.next();
		String password = sc.next();
		
		while(user.equals(password)) {
			System.out.println("Insira uma senha mais forte");
			System.out.println("O nome do usu�rio deve ser diferente da senha");
			user = sc.next();
			password = sc.next();
		}
		
		System.out.println("Cadastro efetuado com sucesso!");
	}

}
