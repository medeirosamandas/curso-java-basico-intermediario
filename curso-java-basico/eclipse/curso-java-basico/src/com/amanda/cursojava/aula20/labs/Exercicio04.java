package com.amanda.cursojava.aula20.labs;

import java.util.Scanner;

/*Faça um progama para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês
 * deve conter 24 horas, onde para cada uma destas 24 horas, podemos associar uma tarefa
 * específica(compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês 
 * que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode 
 * também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado*/

public class Exercicio04 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] agenda = new String[30][24];
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
				System.out.println("Digite o dia e a hora para visualizar o seu conteúdo");
				dia = (sc.nextInt() - 1);
				hora = sc.nextInt();
				
				System.out.println(agenda[dia][hora]);
				
			}else if(opcao == 2) { // alterar compromisso
				System.out.println("Digite o dia e a hora para alterar o seu conteúdo");
				dia = (sc.nextInt() - 1);
				hora = sc.nextInt();
				System.out.println("Insira o compromisso!");
				agenda[dia][hora] = sc.next();
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
