package com.amanda.cursojava.aula15.labs;
// Faça um programa que lê duas notas parciais obtidas por um aluno numa discplina ao longo de um semestre e calcule sua média. A atribuição de conceitos obedece À tabela abaixo.
//MÉDIA DE APROVEITAMENTO    			CONCEITO
// Entre 9.0 e 10.0							A
//Entre 7.5 e 9.0							B
//Entre 6.0 e 7.5							C
//Entre 4.0 e 6.0							D
//Entre 4.0 e zero							E
// O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem "APROVADO" se o conceito for A, B ou C ou "REPROVADO" se o conceito for D ou E

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira duas notas parciais");
		double nota1 = sc.nextInt();
		double nota2 = sc.nextInt();
		
		double media = (nota1 + nota2) / 2;
		String conceito;
		
		if(media >= 9) {
			conceito = "A";
		}else if(media < 9 && media >= 7.5) {
			conceito = "B";
		}else if(media < 7.5 && media >= 6) {
			conceito = "C";
		}else if (media < 6 && media >= 4) {
			conceito = "D";
		}else {
			conceito = "E";
		}
		
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": System.out.println("Aprovado"); break;
		default: System.out.println("Reprovado");
		}

		
	}

}
