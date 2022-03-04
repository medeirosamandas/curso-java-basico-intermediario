package com.amanda.cursojava.aula15.labs;
// Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado
//(é a empresa que deposita). O salário líquido corresponde ao salário bruto mesno os descontos. O programa deverá pedir ao usuário o valor de sua hora e a quantidade de horas trabalhadas no mês.
// Descontos do IR:
//Salário bruto até 900 (inclusive) - isento 
//Salário bruto até 1500 (inclusive) - desconto de 5%
//Salário bruto até 2500 (inclusive) - desconto de 10%
//Salário bruto acima 2500 - desconto de 20% 
// Imprima na tela as informações dispostas, confome o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de horas é 220.

import java.util.Scanner;

//Salário Bruto: (5 * 220) : R$ 1100,00
//(-) IR (5%): R$ 55,00
//(-) INSS (10%): R$ 110,00
//FGTS (11%): R$ 121,00
//Total de descontos: R$ 165,00
//Salário Líquido: R$ 935,00


public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de horas trabalhadas e o valor da sua hora");

		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salarioBruto = valor * horas;
		double inss = salarioBruto * 0.1;
		double fgts = salarioBruto * 0.11;
		double aliquota;
		
		if (salarioBruto <= 900) {
			aliquota = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			aliquota = 0.05;
		} else if(salarioBruto > 1500 & salarioBruto <= 2500) {
			aliquota = 0.1;
		} else {
			aliquota = 0.2;
		}
		double ir = salarioBruto * aliquota;

		
		System.out.println("Salário Bruto: (" + valor + " * " + horas + ") : R$ " + salarioBruto);
		System.out.println("(-) IR (" + (aliquota * 100) + "%): R$ " + ir);
		System.out.println("(-) INSS (10%): R$ " + inss);
		System.out.println("FGTS (11%): R$ "+ fgts);
		System.out.println("Total de descontos: R$ " + (ir + inss));
		System.out.println("Salário Líquido: R$ " + (salarioBruto - ir - inss));
	}

}
