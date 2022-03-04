package com.amanda.cursojava.aula20.labs;

import java.util.Random;

/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. 
 * Após isso, determine o maior número da matriz e a sua posição(linha, coluna)*/

public class Exercicio01 {
	
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		int maior = 0;
		String posicaoMaior = "";
		Random random = new Random();

		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//matriz[i][j] = (int)Math.round(Math.random() * 9);
				matriz[i][j] = random.nextInt(9);
			}
		}
		
			

			for(int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if(matriz[i][j] > maior) {
						maior = matriz[i][j];
						posicaoMaior = "Linha " + (i + 1) + " coluna " + (j + 1);
					}
					if(j == 3) {
						System.out.print(matriz[i][j] + "\n");
					}else {
					System.out.print(matriz[i][j] + " ");
				}
			

	}
			}					System.out.println(posicaoMaior);
			}

}
	
	


