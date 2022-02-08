package com.amanda.cursojava.aula15.labs;
// As organiza��es tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contrataram para desenvolver o programa que calcular� os reajustes.
// Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste seguindo o seguinte crit�rio, baseado no sal�rio atual:
// sal�rios at� 280,00 (incluindo): aumento de 20%
// sal�rios entre 280,00 e 700,00: aumento de 15%
// sal�rios entre 700,00 e 1.500,00: aumento de 10%
// sal�rios de 1.500,00 em diante: aumento de 5%
// Ap�s o aumento ser realizado, informe na tela:
// o sal�rio antes do reajuste
// o percentual de aumento aplicado
// o valor do aumento
// o novo sal�rio, ap�s o aumento

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do sal�rio");
		
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
		
		System.out.println("Sal�rio antes do reajuste: " + salario);
		System.out.println("Percetual de aumento aplicado: " + (percentual * 100) +"%");
		System.out.println("O valor do aumento: " + (salario * percentual));
		System.out.println("O valor do novo sal�rio: " + ((salario * percentual) + salario));
	}

}
