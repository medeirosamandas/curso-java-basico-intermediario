package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*A série de Fibonacci é formada pela sequencia 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... 
 * Fça um programa capaz de gerar a série até o n-ésimo termo.*/

public class Exercicio15 {
	
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o n-ésimo termo da série de fibonacci:");
        int n = scan.nextInt();
        
        int primeiro = 1;
        int segundo = 1;
        int proximo;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
        //1,1,2,3,5
        //primeiro = 1
        //segundo = 2
        //proximo = 3
        
        for (int i=3; i<=n; i++){
            
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.println(proximo);
        }
		
	}

}
