package com.amanda.cursojava.aula17.labs;

/*Altere o programa anterior permitindo ao usuário informar as populações e as 
 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação*/

public class Exercicio05 {
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
