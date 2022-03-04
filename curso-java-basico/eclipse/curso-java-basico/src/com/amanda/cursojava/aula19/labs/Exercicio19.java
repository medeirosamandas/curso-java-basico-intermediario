package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores "Nota1" e "Nota2" do tipo real.
 * Escreva um programa que calcule a média aritmétic imples das notas informadas, armazenando o resultado em um vetor "Result" do mesmo tipo e tamanho.
 * Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7, o aluno estará "aprovado",
 * caso contrário, a situação do aluno será "reprovado"*/

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] result = new double[nota1.length];

		
		for(int i = 0; i < nota1.length; i++) {
			System.out.println("Digite a primeira nota do aluno " + (i + 1));
			nota1[i] = sc.nextDouble();
			System.out.println("Digite a segunda nota do aluno " + (i + 1));
			nota2[i] = sc.nextDouble();
			
			result[i] = (nota1[i] + nota2[i]) / 2;
			
		}
		
		for(int i = 0; i < nota1.length; i++) {
			System.out.println("Média do aluno " + (i + 1) + ": " + result[i]);
			if (result[i] >= 7) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		}

	}

}
