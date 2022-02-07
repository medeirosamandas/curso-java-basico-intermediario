package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s,
		// Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o imposto de renda,
		// 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
		// - sal�rio bruto
		// a. quanto pagou ao INSS
		// b. quanto pagou ao sindicato
		// c. o sal�rio l�quido
		// d. calcule os descontos e sal�rio l�quido, conforme a tabela abaixo:
		// + Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ = Sal�rio L�quido : R$
		// Obs: Sal�rio bruto - Descontos = Sal�rio L�quido
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor/hora");
        double valorHora = sc.nextDouble();
        
        System.out.println("Entre com a quantidade de horas trabalhadas no m�s:");
        double horas = sc.nextDouble();
        
        double salario = valorHora * horas;
		
		double inss = salario * 8 / 100;
		double sindicato = salario * 5 / 100;
		double ir = salario * 11 / 100;
		double liquido = salario - inss - ir - sindicato;
		
        System.out.println("Sal�rio bruto: " + salario);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total descontos: " + (inss + sindicato + ir);
        System.out.println("Sal�rio l�quido: " + liquido);
	}

}
