package com.amanda.cursojava.aula20.labs;

/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. 
 * Após isso, indique qual é o maior e o menor valor da linha 5 e qual 
 * é o maior e o menor valor da coluna 7*/

public class Exercicio02 {
	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		int maior5 = 0;
		int menor5 = 10;
		int maior7 = 0;
		int menor7 = 10;

		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 9);
			}
		}
		
			

			for(int i = 0; i < 10; i++) {
				System.out.println("Linha " + i);
				for (int j = 0; j < 10; j++) {
					if(i == 5) {
					if(matriz[i][j] > maior5) {
						maior5 = matriz[i][j];
					}
					if(matriz[i][j] < menor5) {
						menor5 = matriz[i][j];
					}}
					
					if(i == 7) {
					if(matriz[i][j] > maior7) {
						maior7 = matriz[i][j];
					}
					if(matriz[i][j] < menor7) {
						menor7 = matriz[i][j];
					}}
					if(j == 9) {
						System.out.print(matriz[i][j] + "\n");
					}else {
					System.out.print(matriz[i][j] + " ");
				}
			

	}
			}					

			System.out.println("Maior e menor números linha 5: " + maior5 + " e " + menor5);
			System.out.println("Maior e menor números linha 7: " + maior7 + " e " + menor7);
	}

}
