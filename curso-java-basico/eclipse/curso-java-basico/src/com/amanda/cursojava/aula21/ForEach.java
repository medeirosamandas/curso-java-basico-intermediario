package com.amanda.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] notas = new int[10];
		Random random = new Random();
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
//		for(int nota : notas) {
//			System.out.println(nota);
//		}
		
		
		// exemplo 2
		
		System.out.println("Exemplos com arrays multidimensionais");
		
		int[][] notasAlunos = new int[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for(int[] notaAluno : notasAlunos) {
			for(double nota : notaAluno) {
				System.out.print(nota + " ");
			}
			System.out.println();
		}
	}

}
