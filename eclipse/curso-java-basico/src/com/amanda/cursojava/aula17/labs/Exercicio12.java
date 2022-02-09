package com.amanda.cursojava.aula17.labs;
/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número 
 * inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a 
 * tabuada. A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 * */

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número que deseja saber a tabuada: ");
		
		int numero = sc.nextInt();
		
		System.out.println("Tabuada de " + numero);
		
		for(int i = 1; i < 11; i++) {
		System.out.println(numero + " x " + i + " = " + (i*numero));	
		}
	}

}
