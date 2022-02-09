package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

// Faça um programa que peça uma nota entre zero e dez. 
//Mostre uma mensagem caso o valor seja inválido e continue pedindo até 
// que o usuário informe um valor válido.

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma nota entre 0 e 10");
		
		int number = sc.nextInt();
		
		while(number < 0 || number > 10) {
			System.out.println("Número inválido");
			System.out.println("Insira novamente um número válido");
			
			number = sc.nextInt();
			
		}
		
		System.out.println("Número válido. " + number);
		
	}

}
