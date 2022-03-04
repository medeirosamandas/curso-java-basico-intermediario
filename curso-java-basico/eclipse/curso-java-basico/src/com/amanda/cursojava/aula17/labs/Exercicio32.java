package com.amanda.cursojava.aula17.labs;
/*O card�pio de uma lanchonete � o seguinte:
 * Especifica��o			C�digo				Pre�o
 * Cachorro quente			100					R$ 1,20
 * Bauru Simples			101					R$ 1,30
 * Bauru com ovo			102					R$ 1,50
 * Hamb�rger				103					R$ 1,20
 * Cheeseburger				104					R$ 1,30
 * Refrigerante				105					R$ 1,00
 * 
 * Fa�a um programa que leia o c�digo dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item (pre�o * quantidade) e o total geral do pedido.
 * Considere que o cliente deve informar quando o pedido deve ser encerrado*/

import java.util.Scanner;

public class Exercicio32 {
	
	   public static void main(String[] args){
	        
	        Scanner scan = new Scanner(System.in);
	        
	        boolean naoTerminar = true;
	        int cod, qtd;
	        double total = 0;
	        String output = "";
	        
	        do {
	            
	            System.out.println("Digite o c�digo e a quantidade. Digite 0 0 para sair.");
	            cod = scan.nextInt();
	            qtd = scan.nextInt();
	            
	            if (cod == 0 && qtd == 0){
	                naoTerminar = false;
	                output += "Total a pagar = " + total;
	            } else {
	                
	                if (cod == 100){
	                    output += "Cachorro Quente -> 1,20 * " + qtd ;
	                    output += " = " + (1.2*qtd) + "\n";
	                    total += 1.2*qtd;
	                } else if (cod == 101){
	                    output += "Bauru Simples -> 1,30 * " + qtd ;
	                    output += " = " + (1.3*qtd) + "\n";
	                    total += 1.3*qtd;
	                } else if (cod == 102){
	                    output += "Bauru com ovo -> 1,50 * " + qtd ;
	                    output += " = " + (1.5*qtd) + "\n";
	                    total += 1.5*qtd;
	                } else if (cod == 103){
	                    output += "Hamb�rguer -> 1,20 * " + qtd ;
	                    output += " = " + (1.2*qtd) + "\n";
	                    total += 1.2*qtd;
	                } else if (cod == 104){
	                    output += "Cheeseburguer -> 1,30 * " + qtd ;
	                    output += " = " + (1.3*qtd) + "\n";
	                    total += 1.3*qtd;
	                } else if (cod == 105){
	                    output += "Refrigerante -> 1,00 * " + qtd ;
	                    output += " = " + (1*qtd) + "\n";
	                    total += 1*qtd;
	                }
	            }
	            
	        }while(naoTerminar);
	        
	        System.out.println(output);
	    }

}
