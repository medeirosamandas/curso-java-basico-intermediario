package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio03 {
	
	// Fa�a um programa que verifique se uma letra digitada � "F" ou "M". Conforme a letra, escrever: F - Feminino, M - Masculino, Sexo inv�lido.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Insira um sexo");
		String sexo = sc.next();
		
		if(sexo.equals("F") || sexo.equals("f")) {
			System.out.println("F - Feminino");
		} else if(sexo.equals("M") || sexo.equals("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo inv�lido");
		}
	}

}
