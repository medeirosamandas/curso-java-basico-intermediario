package com.amanda.cursojava.aula17.labs;

/*Supondo que a popula��o de um pa�s A seja da ordem de 80.000 habitantes 
 * com uma taxa anual de crscimento de 3% e que a popula��o B seja 200.000 habitantes, 
 * com uma taxa de crescimento de 1.5%. Fa�a um programa
que calcule e escreva o n�mero de anos necess�rios para uque a popula��o do 
pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento. */

public class Exercicio04 {
	public static void main(String[] args) {
		double taxaCrescimentoCidadeA = 0.03;
		double taxaCrescimentoCidadeB = 0.015;
		int habitantesCidadeA = 80000;
		int habitantesCidadeB = 200000;
		
		int anos = 0;
		
		while(habitantesCidadeA < habitantesCidadeB) {
			habitantesCidadeA += (habitantesCidadeA * taxaCrescimentoCidadeA);
			habitantesCidadeB += (habitantesCidadeB * taxaCrescimentoCidadeB);
			anos++;
			System.out.println("Habitantes cidade A: " + habitantesCidadeA);
			System.out.println("Habitantes cidade B: " + habitantesCidadeB);
			System.out.println(anos);

					
		}
	}

}
