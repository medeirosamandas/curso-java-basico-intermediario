package com.amanda.cursojava.aula17.labs;
/*O senhor Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente deve pagar, ele desenvolveu uma tabela que contém o número de itens
 * que o cliente comprou e ao lado o valor da conta. Desta forma, a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços.
 * Você foi contratado para desenvolver o programa que monta esta tabela de preços, que conterá os preços de 1 até 50 produtos, conforme exemplo abaixo
 * 
 * Lojas Quase Dois - Tabela de preços
 * 1 - 1.99
 * 2 - 3.98
 * ...
 * 50 - 99.50*/
public class Exercicio23 {
	
	  public static void main(String[] args){
	        
	       // Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Lojas Quase Dois - Tabela de preços");
	        
	        for (int i=1; i<=50; i++){
	            System.out.println(i + " - R$ " + (1.99*i));
	        }
	    }

}
