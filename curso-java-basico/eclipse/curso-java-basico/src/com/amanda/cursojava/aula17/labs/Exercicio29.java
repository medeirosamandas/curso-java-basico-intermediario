package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Encontrar n�meros primos � uma tarefa dif�cil. F�a um programa que gera uma lista
 *  dos n�meros primos existentes entre 1 e um n�mero inteiro informado pelo usu�rio*/


public class Exercicio29 {
public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um n�mero");
        int num = scan.nextInt();
        
        boolean primo;
        
        for (int i=1; i<=num; i++){
            
            primo = true;
        
            for (int j=2; j<i; j++){
                if (i % j == 0){
                    //System.out.println("N�o � primo - divis�vel por " + i);
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
