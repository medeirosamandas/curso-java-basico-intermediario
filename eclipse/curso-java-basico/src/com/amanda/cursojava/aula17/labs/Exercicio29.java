package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Encontrar números primos é uma tarefa difícil. Fça um programa que gera uma lista
 *  dos números primos existentes entre 1 e um número inteiro informado pelo usuário*/


public class Exercicio29 {
public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        boolean primo;
        
        for (int i=1; i<=num; i++){
            
            primo = true;
        
            for (int j=2; j<i; j++){
                if (i % j == 0){
                    //System.out.println("Não é primo - divisível por " + i);
                    primo = false;
                    //break;
                }
            }

            if (primo){
                System.out.println(i);
            }
        }
    }

}
