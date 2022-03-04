package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que receba dois n�meros inteiros e gere os n�meros 
 * inteiros que est�o no intervalo compreendido por eles*/
public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva dois n�meros inteiros");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MIN_VALUE;
		
		if (num1 == num2) {
			System.out.println("N�meros s�o iguais, n�o h� n�meros inteiros entre eles.");	
		}else if(num1 > num2) {
			maior = num1;
			menor = num2;
			
			System.out.println("Os n�meros entre " + menor + " e " + maior + " s�o: ");
			for(int i = menor + 1; i < maior; i++) {
				System.out.println(i);
			}
		}else {
			maior = num2;
			menor = num1;
			
			System.out.println("Os n�meros entre " + menor + " e " + maior + " s�o: ");
			for(int i = menor + 1; i < maior; i++) {
				System.out.println(i);
			}
		}

		
	}

}
