package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês,
		// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o imposto de renda,
		// 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
		// - salário bruto
		// a. quanto pagou ao INSS
		// b. quanto pagou ao sindicato
		// c. o salário líquido
		// d. calcule os descontos e salário líquido, conforme a tabela abaixo:
		// + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ = Salário Líquido : R$
		// Obs: Salário bruto - Descontos = Salário Líquido
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor/hora");
        double valorHora = sc.nextDouble();
        
        System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
        double horas = sc.nextDouble();
        
        double salario = valorHora * horas;
		
		double inss = salario * 8 / 100;
		double sindicato = salario * 5 / 100;
		double ir = salario * 11 / 100;
		double liquido = salario - inss - ir - sindicato;
		
        System.out.println("Salário bruto: " + salario);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total descontos: " + (inss + sindicato + ir);
        System.out.println("Salário líquido: " + liquido);
	}

}
