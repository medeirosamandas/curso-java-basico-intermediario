package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As pessoas s�o:
//a. "Telefonou para a v�tima?"
//b. "Esteve no local do crime?"
//c. "Mora perto da v�tima?"
//d. "Devia para a v�tima?"
//e. "J� trabalhou com a v�tima?"
// O programa deve no final emitir uma classifia��o sobre a participa��o da pessoa no crime. Se a pessoa responder positivamente a 2 quest�es, ela deve ser classificada como suspeita, entre 3 e 4 como C�mplice e 5 como Assassino.
// Caso contr�rio, ele ser� classificado como inocente

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Responda 1 para Sim e 0 para n�o");
		System.out.println("Telefonou para a v�tima?");
		int perg1 = sc.nextInt();
		System.out.println("Esteve no local do crime?");
		int perg2 = sc.nextInt();
		System.out.println("Mora perto da v�tima?");
		int perg3 = sc.nextInt();
		System.out.println("Devia para a v�tima?");
		int perg4 = sc.nextInt();
		System.out.println("J� trabalhou com a v�tima?");
		int perg5 = sc.nextInt();
		
		int soma = perg1 + perg2 + perg3 + perg4 + perg5;
		
		if (soma == 2) {
			System.out.println("Suspeito");
		}
		else if(soma > 2 && soma <= 4){
			System.out.println("C�mplice");
			
		}
		else if( soma > 4) {
			System.out.println("Assassino");
		}
		else {
			System.out.println("Inocente");
		}


		
	
	}
}
