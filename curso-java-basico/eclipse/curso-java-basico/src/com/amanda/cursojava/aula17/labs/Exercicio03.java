package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

// Faça um programa que leia e valide as seguintes informações:
// a. Nome: maior que 3 caracteres;
// b. Idade: entre  e 0 e 150;
// c. Salário: maior que zero
// d. Sexo: 'f' ou 'm'
// e. Estado civil: 's', 'c', 'v', 'd';

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		String sexo, estadoCivil;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome");
		String nome = sc.next();
		
		while(nome.length() < 3) {
			System.out.println("Nome inválido, insira novamente");
			nome = sc.next();
		}
		System.out.println("Insira a idade");
		int idade = sc.nextInt();
		
		while(idade < 0 || idade > 150) {
			System.out.println("Idade inválida, insira novamente");
			idade = sc.nextInt();
		}
		
		System.out.println("Insira o salário");
		double salario = sc.nextDouble();
		
		while(salario < 0) {
			System.out.println("Salário inválido, insira novamente");
			salario = sc.nextDouble();
		}
		
		boolean infoValida = false;
        do {
            
            System.out.println("Entre com o sexo:");
            
           sexo = sc.next();
            
            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!infoValida);
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o estado civil:");
            
            estadoCivil = sc.next();
            
            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!infoValida);
        
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

	}

}
