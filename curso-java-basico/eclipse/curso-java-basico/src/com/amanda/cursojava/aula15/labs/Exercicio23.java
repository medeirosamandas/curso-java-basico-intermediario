package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// O hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel. Confira:
// 						At� 5kg					Acima de 5kg
// Fil� duplo			4,90 por kg				5,80 por kg
// Alcatra				5,90 por kg				6,80 por kg
// Picanha				6,90 por kg				7,80 por kg
// Para atender a todos os clientes, cada cliente poder� levar apenas um dos tipos de carne da promo��o, por�m n�o h� limites para
// a quantidade de carne por cliente. Se a compra for feita no cart�o tabajara, o cliente receber� ainda um desconto de 5% sobre o total
// da compra. Escreva um programa que pe�a o tipo e quantidade de carne comprada pelo usu�rio e gere um cupom fiscal, contendo as
// informa��es da compra: tipo e quantidade de carne, pre�o total, tipo de pagamento, valor do desconto e valor a pagar.


public class Exercicio23 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Entre com o tipo da carne:");
	        System.out.println("1 - file duplo");
	        System.out.println("2 - alcatra");
	        System.out.println("3 - picanha");
	        int tipo = scan.nextInt();
	        
	        System.out.println("Entre com a quantidade (kg):");
	        double qtd = scan.nextDouble();
	        
	        double precoKg = 0;
	        
	        if (tipo == 1){
	            
	            System.out.println(qtd + "kg - file duplo");
	            
	            if (qtd < 5){
	               precoKg = 4.9; 
	            } else {
	                precoKg = 5.8;
	            }
	            
	            
	        } else if (tipo == 2){
	            
	            System.out.println(qtd + "kg - alcatra");
	            
	            if (qtd < 5){
	               precoKg = 5.9; 
	            } else {
	                precoKg = 6.8;
	            }
	        } else if (tipo == 3){
	            
	            System.out.println(qtd + "kg - picanha");
	            
	            if (qtd < 5){
	               precoKg = 6.9; 
	            } else {
	                precoKg = 7.8;
	            }
	        }
	        
	        double total = qtd * precoKg;
	        System.out.println(qtd + "kg * " + precoKg + " = " + total);
	        
	        System.out.println("Compra no cart�o? digite 1 para sim:");
	        int cartao = scan.nextInt();
	        
	        if (cartao == 1){
	            double desconto = (total / 100) * 5;
	            System.out.println("Desconto de: " + desconto);
	            System.out.println("Valor a pagar: " + (total - desconto));
	        } else {
	            System.out.println("Valor a pagar: " + total);
	        }
	}

}
