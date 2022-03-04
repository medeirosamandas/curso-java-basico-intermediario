package com.amanda.cursojava.aula20.labs;

import java.util.Scanner;

/*Capture do teclado valores para preenchimento de uma matriz M 3x3.
 * Após a captura, imprima a matriz criada e encontre a quantidade de números 
 * pares e a quantidade de números ímpares*/

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int pares = 0;
		int impares = 0;
		
		System.out.println("Insira 9 números");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] % 2 == 0) {
					pares++;
				}else {
					impares++;
				}
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
		System.out.println("\nQuantidade de pares: " + pares);
		System.out.println("Quantidade de ímpares: " + impares);
	}

}
