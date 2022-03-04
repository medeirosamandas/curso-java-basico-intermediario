package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que calcule o valor total investido por um colecionador em sua cole��o de 
 * CDs e o valor m�dio gasto em cada um deles. O usu�rio dever� informar a quantidade de CDs e o
 *  valor de cada um.*/


public class Exercicio22 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o n�mero de CDs:");
        int cds = scan.nextInt();
        
        double preco;
        double soma = 0;
        
        for (int i=1; i<= cds; i++){
            
            System.out.println("Informe o valor do cd " + i);
            preco = scan.nextDouble();
            
            soma += preco;
        }
        
        double media = soma / cds;
        
        System.out.println("M�dia gasta com cada CD: " + media);
    }

}
