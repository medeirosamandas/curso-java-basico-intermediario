package com.amanda.cursojava.aula20.labs;

import java.util.Scanner;

/*Modifique o programa anterior de maneira a guardar os compromissos de todo o ano,
 * organizados por mês, dia e hora (Só 8 horas por dia)*/

public class Exercicio05 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][][] agenda = new String[12][30][8];
		int mes;
		int dia;
		int hora;
		boolean sair = false;
		int opcao;
		
	/*	public static void showAgenda() {
			

			for (int i = 0; i < 30; i++) {
				System.out.println("Dia " + (i + 1));
				for (int j = 0; j < 24; j++)
					if(j == 23) {
						System.out.print(j);
						System.out.println(agenda[i][j]);
				}else {
					System.out.print(j + "hr ");
					System.out.print(agenda[i][j] + " ");

				}
			}
		}*/
		System.out.println("Bem vindo a sua agenda!");

		while(!sair) {
			System.out.println("Digite 1 pra visualizar compromissos");
			System.out.println("Digite 2 pra alterar compromissos");
			System.out.println("Digite 0 pra sair da agenda");
			
			opcao = sc.nextInt();
			
			if(opcao == 1) { // visualizar compromisso
				System.out.println("Digite o mês, dia e a hora para alterar o seu conteúdo");
				mes = (sc.nextInt() - 1);
				dia = (sc.nextInt() - 1);
				hora = sc.nextInt();
				
				System.out.println(agenda[mes][dia][hora]);
				
			}else if(opcao == 2) { // alterar compromisso
				System.out.println("Digite o mês, dia e a hora para alterar o seu conteúdo");
				mes = (sc.nextInt() - 1);
				dia = (sc.nextInt() - 1);
				hora = sc.nextInt();
				System.out.println("Insira o compromisso!");
				agenda[mes][dia][hora] = sc.next();
				System.out.println("Compromisso adicionado");
				
			}else if(opcao == 0) {
				sair = true;
			}else {
				System.out.println("Opção inválida, por favor  digite um número válido");
				System.out.println("Digite 1 pra visualizar compromissos");
				System.out.println("Digite 2 pra alterar compromissos");
				System.out.println("Digite 0 pra sair da agenda");
				opcao = sc.nextInt();
			}
			
			
			// telefone sicoob 32194740
			
			
		}
		
		
		
		
	}

}
