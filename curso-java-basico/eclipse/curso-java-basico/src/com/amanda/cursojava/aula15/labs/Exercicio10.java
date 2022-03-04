package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno. Imrpima a mensagem "Bom dia", "Boa tarde", "Boa noite", "Valor inválido", confome o caso
public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o turno que você estuda?");
		System.out.println("M-matutino ou V-vespertino ou N-noturno");

		String turno = sc.next();
		
		
		switch(turno) {
		case "M": System.out.println("Bom dia"); break;
		case "V": System.out.println("Boa tarde"); break;
		case "N": System.out.println("Boa noite"); break;
		default: System.out.println("Favor inserir um turno válido"); break;
		}


	}

}
