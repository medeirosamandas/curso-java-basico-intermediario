package com.amanda.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um dia da semana (1-7)");
		int diaSemana = sc.nextInt();
		
		// mais verboso que o switch
		
		if (diaSemana  == 1) {
			System.out.println("Domingo");
		} else if(diaSemana == 2) {
			System.out.println("Segunda");
		} else if(diaSemana == 3) {
			System.out.println("Ter�a");
		} else if(diaSemana == 4) {
			System.out.println("Quarta");
		} else if(diaSemana == 5) {
			System.out.println("Quinta");
		} else if(diaSemana == 6) {
			System.out.println("Sexta");
		} else if(diaSemana == 7) {
			System.out.println("S�bado");
		} else {
			System.out.println("N�o � um dia da semana v�lido");
		}
		
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Ter�a"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("S�bado"); break;
		default: System.out.println("N�o � um dia da semana v�lido"); break;

		}
		
		// este estilo � condicional, se o valor for entre 2 e 6, ele vai executar o c�digo que est� no case:6
		// caso o valor for 1 ou 7, vai executar o c�digo do case 7
		
		switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia �til"); break;
		case 1: 
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("N�o � um dia da semana v�lido"); break;

		}
	}

}
