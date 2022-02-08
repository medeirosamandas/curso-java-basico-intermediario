package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Fa�a um programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual opera��o ele deseja realizar. O resultado da opera��o deve ser acompanhado de uma frase que diga se o n�mero �
// a. par ou �mpar
// b. positivo ou negativo

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois n�meros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int resultado;
		
		System.out.println("Qual opera��o voc� deseja realizar?");
		String operacao = sc.next();
		System.out.println(operacao);
		
		switch(operacao) {
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		default: System.out.println("Opera��o inv�lida"); resultado = 0; break;}
		
		System.out.println("O resultado desta opera��o �: " + resultado);
		if (resultado > 0) {
			System.out.println("N�mero positivo");
		} else {
			System.out.println("N�mero negativo");
		}
		
		if(resultado % 2 == 0) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�mero �mpar");
		}
		}
	}


