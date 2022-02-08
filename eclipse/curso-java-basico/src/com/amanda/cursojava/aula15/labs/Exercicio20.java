package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As pessoas são:
//a. "Telefonou para a vítima?"
//b. "Esteve no local do crime?"
//c. "Mora perto da vítima?"
//d. "Devia para a vítima?"
//e. "Já trabalhou com a vítima?"
// O programa deve no final emitir uma classifiação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões, ela deve ser classificada como suspeita, entre 3 e 4 como Cúmplice e 5 como Assassino.
// Caso contrário, ele será classificado como inocente

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Responda 1 para Sim e 0 para não");
		System.out.println("Telefonou para a vítima?");
		int perg1 = sc.nextInt();
		System.out.println("Esteve no local do crime?");
		int perg2 = sc.nextInt();
		System.out.println("Mora perto da vítima?");
		int perg3 = sc.nextInt();
		System.out.println("Devia para a vítima?");
		int perg4 = sc.nextInt();
		System.out.println("Já trabalhou com a vítima?");
		int perg5 = sc.nextInt();
		
		int soma = perg1 + perg2 + perg3 + perg4 + perg5;
		
		if (soma == 2) {
			System.out.println("Suspeito");
		}
		else if(soma > 2 && soma <= 4){
			System.out.println("Cúmplice");
			
		}
		else if( soma > 4) {
			System.out.println("Assassino");
		}
		else {
			System.out.println("Inocente");
		}


		
	
	}
}
