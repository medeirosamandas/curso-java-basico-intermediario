package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que pe�a para n pessoas a sua idade, ao final do programa dever� 
 * se a m�dia da turma varia entre 0 e 25, 26 e 60, maior que 60; e ent�o
 * dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada */

public class Exercicio20 {
	
	   public static void main(String[] args){
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Entre com a quantidade de idades");
	        int idades = scan.nextInt();
	        
	        int idade;
	        int soma = 0;
	        
	        for (int i=0; i<idades; i++){
	            
	            System.out.println("Entre com a idade da pessoa " + (i+1));
	            idade = scan.nextInt();
	            
	            soma += idade;
	        }
	        
	        double media = soma / idades;
	        
	        System.out.println("M�dia de idade: " + media);
	        
	        if (media >= 0 && media <=25){
	            System.out.println("jovem");
	        } else if (media >= 26 && media <=60){
	            System.out.println("adulta");
	        } else if (media > 60){
	            System.out.println("idosa");
	        }
	    }

}
