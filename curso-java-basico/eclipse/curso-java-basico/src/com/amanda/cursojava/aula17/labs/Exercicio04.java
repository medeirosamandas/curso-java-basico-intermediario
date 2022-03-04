package com.amanda.cursojava.aula17.labs;

/*Supondo que a população de um país A seja da ordem de 80.000 habitantes 
 * com uma taxa anual de crscimento de 3% e que a população B seja 200.000 habitantes, 
 * com uma taxa de crescimento de 1.5%. Faça um programa
que calcule e escreva o número de anos necessários para uque a população do 
país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento. */

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
