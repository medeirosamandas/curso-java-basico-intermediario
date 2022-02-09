package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado 
 * pelo usu�rio, mas a tabuada n�o deve necessariamente iniciar em 1 e terminar em 10. O valor inicial 
 * e final devem ser informados tamb�m pleo usu�rio, conforme exemplo abaixo:
 * 
 * Montar a tabuada de: 5 
 * Come�ar por: 4
 * Terminar em: 7
 * 
 * Vou montar a tabuada de 5 come�ando em 4 e terminando em 7:
 * 5x4 = 20
 * 5x5 = 25
 * 5x6 = 30
 * 5x7 = 35
 * 
 * Obs: Voc� deve veriricar se o usu�rio n�o digitou o final menor que o inicial*/


public class Exercicio30 {
	
	   public static void main(String[] args){
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Entre com o n�mero para gerar a tabuada:");
	        int num = scan.nextInt();
	        
	        boolean invalido = true;
	        int numFinal, numInicio;
	        
	        do {
	            
	            System.out.println("Entre com o in�cio da tabuada");
	            numInicio = scan.nextInt();

	            System.out.println("Entre como final da tabuada");
	            numFinal = scan.nextInt();

	            if (numFinal > numInicio){
	                invalido = false;
	            }
	            
	        } while (invalido);
	        
	        
	        System.out.println("Tabuada de " + num + ":");
	        System.out.println("Come�ar por: " + numInicio);
	        System.out.println("Terminar em: " + numFinal);
	        System.out.println();
	        
	        for (int i=numInicio; i<=numFinal; i++){
	            System.out.println(num + " x " + i + " = " + (num*i));
	        }
	    }

}
