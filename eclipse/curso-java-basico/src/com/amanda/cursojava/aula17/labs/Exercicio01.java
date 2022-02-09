package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

// Fa�a um programa que pe�a uma nota entre zero e dez. 
//Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� 
// que o usu�rio informe um valor v�lido.

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma nota entre 0 e 10");
		
		int number = sc.nextInt();
		
		while(number < 0 || number > 10) {
			System.out.println("N�mero inv�lido");
			System.out.println("Insira novamente um n�mero v�lido");
			
			number = sc.nextInt();
			
		}
		
		System.out.println("N�mero v�lido. " + number);
		
	}

}
