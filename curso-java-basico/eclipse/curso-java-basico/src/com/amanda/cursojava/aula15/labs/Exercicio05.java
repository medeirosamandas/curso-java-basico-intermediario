package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio05 {
	
	//Faça um programa para a leitura de duas notas parciais de um aluno.
	// O programa deve calcular a média alcançada por aluno e apresentar:
	// - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete
	// - A mensagem "Reprovado", se a média for menor que sete;
	// - A mensagem "Aprovado com Distinção", se a média for igual a dez

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira duas notas parciais");
		double nota1 = sc.nextInt();
		double nota2 = sc.nextInt();
		
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if(media < 10 && media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}

}
