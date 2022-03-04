package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho e com os 
 * mesmos elementos que A, 
 * sendo que elestes deverão estar invertidos, ou seja, o primerio elemento de A passa 
 * a ser o último de B e assim por diante*/

public class Exercicio28 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
            
            vetorB[vetorA.length - i - 1] = vetorA[i];
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }    

}
