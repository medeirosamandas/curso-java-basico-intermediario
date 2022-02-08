package com.amanda.cursojava.aula15.labs;
// As organizações tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
// Faça um programa que recebe o salário de um colaborador e o reajuste seguindo o seguinte critério, baseado no salário atual:
// salários até 280,00 (incluindo): aumento de 20%
// salários entre 280,00 e 700,00: aumento de 15%
// salários entre 700,00 e 1.500,00: aumento de 10%
// salários de 1.500,00 em diante: aumento de 5%
// Após o aumento ser realizado, informe na tela:
// o salário antes do reajuste
// o percentual de aumento aplicado
// o valor do aumento
// o novo salário, após o aumento

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do salário");
		
		double salario = sc.nextDouble();
		double percentual;
		
		if (salario <= 280) {
			percentual = 0.2;
		}else if (salario > 280 && salario <= 700) {
			percentual = 0.15;
		}
		else if(salario > 700 && salario <= 1500) {
			percentual = 0.1;
		}else {
			percentual = 0.05;
		}
		
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percetual de aumento aplicado: " + (percentual * 100) +"%");
		System.out.println("O valor do aumento: " + (salario * percentual));
		System.out.println("O valor do novo salário: " + ((salario * percentual) + salario));
	}

}
