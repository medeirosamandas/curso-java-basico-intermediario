package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet (em Mbps)
		// calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tamanho do arquivo em MB e a velocidade da internet em Mbps");
		double tamanho = sc.nextDouble();
		double velocidade = sc.nextDouble();
		
		double minutos = ( tamanho / velocidade );
		System.out.println("Seu arquivo será baixado em " + minutos + " minutos.");


	}

}
