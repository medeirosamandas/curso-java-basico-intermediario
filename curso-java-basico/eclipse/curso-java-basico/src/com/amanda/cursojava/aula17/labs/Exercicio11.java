package com.amanda.cursojava.aula17.labs;
/*Altere o programa anterior para mostrar no final a soma dos números*/

import java.util.Scanner;

public class Exercicio11 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva dois números inteiros");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MIN_VALUE;
		int soma = 0;
		
		if (num1 == num2) {
			System.out.println("Números são iguais, não há números inteiros entre eles.");	
		}else if(num1 > num2) {
			maior = num1;
			menor = num2;
			
			System.out.println("Os números entre " + menor + " e " + maior + " são: ");
			for(int i = menor + 1; i < maior; i++) {
				System.out.println(i);
				soma += i;
			}
		}else {
			maior = num2;
			menor = num1;
			
			System.out.println("Os números entre " + menor + " e " + maior + " são: ");
			for(int i = menor + 1; i < maior; i++) {
				System.out.println(i);
				soma += i;
			}
		}
		System.out.println("A soma dos números é: " + soma);

		
	}

}
