package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04 {
	
	// Faça um programa que verifique se uma letra digitada é vogal ou consoante

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma letra");
		String letra = sc.next();
		
		
		switch(letra) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("Vogal"); break;
		default: System.out.println("Consoante"); break;
		}
		
		
		
		
	}

}
