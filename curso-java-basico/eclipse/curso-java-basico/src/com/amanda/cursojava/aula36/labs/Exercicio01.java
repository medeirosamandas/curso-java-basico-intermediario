package com.amanda.cursojava.aula36.labs;

import java.util.Scanner;

/*Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada contato possui nome, telefone e email. A
 * agenda também possui um nome. Crie um programa teste que peça para o usuário entrar com o nome da agenda e em
 * seguida 3 contatos. Crie métodos que retornem uma String com a informação de cada contato e também de todos
 * os contatos da agenda.*/
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String email;
		String telefone;
		
		System.out.println("Insira o nome da sua agenda: ");		
		nome = sc.next();
		Agenda agenda = new Agenda();
		agenda.setNomeDaAgenda(nome);
		
		Contato[] contatos = new Contato[3];

		
		for(int i = 0; i < 3; i++) {
			Contato c = new Contato();
			System.out.println("Insira o nome do contato" + (i +1));
			nome = sc.next();
			c.setNome(nome);
			
			System.out.println("Insira o telefone do contato"  + (i +1));
			telefone = sc.next();
			c.setTelefone(telefone);
			
			System.out.println("Insira o email do contato " + (i +1));
			email = sc.next();
			c.setEmail(email);
			
			contatos[i] = c;
			
		}

		agenda.setContatos(contatos);
		
		System.out.println(agenda.obterInfo());
		
		
	}
}
