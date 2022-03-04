package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor 
 * A e uma mensagem indicando se o respectivo elemento � um pn�mero primo ou n�o*/

public class Exercicio33 {
	
	   public static void main(String[] args){
	        
	        Scanner scan = new Scanner(System.in);
	        
	        int[] vetorA = new int[5];
	        
	        for (int i=0; i<vetorA.length; i++){
	            
	            System.out.println("Entre com o valor da posi��o A - " + i);
	            vetorA[i] = scan.nextInt();
	        }
	        
	        boolean primo;
	        String msg;
	        
	        for (int i=0; i<vetorA.length; i++){
	            
	            primo = true;
	            for (int j=2; j<vetorA[i]; j++){
	                if (vetorA[i] % j == 0){
	                    primo = false;
	                    break;
	                }
	            }
	            
	            msg = "";
	            if (primo){
	                msg = " primo";
	            } else {
	                msg = " n�o � primo";
	            }
	            
	            System.out.println(vetorA[i] + msg);
	        }
	    }    

}
