package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Faça um programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é
// a. par ou ímpar
// b. positivo ou negativo

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int resultado;
		
		System.out.println("Qual operação você deseja realizar?");
		String operacao = sc.next();
		System.out.println(operacao);
		
		switch(operacao) {
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		default: System.out.println("Operação inválida"); resultado = 0; break;}
		
		System.out.println("O resultado desta operação é: " + resultado);
		if (resultado > 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
		
		if(resultado % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
		}
	}


