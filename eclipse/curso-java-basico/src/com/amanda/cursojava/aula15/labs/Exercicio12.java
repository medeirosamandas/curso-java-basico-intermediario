package com.amanda.cursojava.aula15.labs;
// Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do Imposto de Renda, que depende do sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do sal�rio bruto, mas n�o � descontado
//(� a empresa que deposita). O sal�rio l�quido corresponde ao sal�rio bruto mesno os descontos. O programa dever� pedir ao usu�rio o valor de sua hora e a quantidade de horas trabalhadas no m�s.
// Descontos do IR:
//Sal�rio bruto at� 900 (inclusive) - isento 
//Sal�rio bruto at� 1500 (inclusive) - desconto de 5%
//Sal�rio bruto at� 2500 (inclusive) - desconto de 10%
//Sal�rio bruto acima 2500 - desconto de 20% 
// Imprima na tela as informa��es dispostas, confome o exemplo abaixo. No exemplo o valor da hora � 5 e a quantidade de horas � 220.

import java.util.Scanner;

//Sal�rio Bruto: (5 * 220) : R$ 1100,00
//(-) IR (5%): R$ 55,00
//(-) INSS (10%): R$ 110,00
//FGTS (11%): R$ 121,00
//Total de descontos: R$ 165,00
//Sal�rio L�quido: R$ 935,00


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

		
		System.out.println("Sal�rio Bruto: (" + valor + " * " + horas + ") : R$ " + salarioBruto);
		System.out.println("(-) IR (" + (aliquota * 100) + "%): R$ " + ir);
		System.out.println("(-) INSS (10%): R$ " + inss);
		System.out.println("FGTS (11%): R$ "+ fgts);
		System.out.println("Total de descontos: R$ " + (ir + inss));
		System.out.println("Sal�rio L�quido: R$ " + (salarioBruto - ir - inss));
	}

}
