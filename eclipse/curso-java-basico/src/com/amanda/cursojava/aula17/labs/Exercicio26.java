package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!= 5x4x3x2x1=120. A saída deve ser conforme o exemplo abaixo:
 * 
 * Fatorial de: 5
 * 
 * 5! = 5x4x3x2x1=120*/


public class Exercicio26 {
	
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = scan.nextInt();
        
        System.out.println("Fatorial de " + num);
        
        System.out.print(num + "! = ");
        
        int fatorial = 1;
        for (int i=num; i>1; i--){
            fatorial *= i;
            System.out.print(i + " . ");
        }
        
        System.out.print(" 1 = " + fatorial);
       
    }

}
