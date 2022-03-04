package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

//Uma fruteira est� vendendo frutas com a seguinte tabela de pre�os
//	at� 5kg					acima de 5kg
//MORANGO			2,50 por kg				2,20 por kg
//MA��				1,80 por kg				1,50 por kg

//Se o cliente comprar mais de 8kg em frutas, ou o valor total da compra ultrapassar 25,00 reais, receber� ainda um desconto
//de 10% sobre este total. Escreva um algor�tmo para ler a quantidade (em kg) de morangos e a quantidade (em kg) de ma��s adquiridas
//e escreva o valor a ser pago pelo cliente

public class Exercicio22 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade (kg) de morango:");
        double qtdMorango = scan.nextDouble();
        
        System.out.println("Entre com a quantidade (kg) de ma�a:");
        double qtdMaca = scan.nextDouble();
        
        double precoKgMorango = 0;
        if (qtdMorango <= 5){
           precoKgMorango =  2.5;
        } else {
            precoKgMorango =  2.2;
        }
        
        double precoKgMaca = 0;
        if (qtdMaca <= 5){
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }
        
        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;
        
        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;
        
        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }
        
        System.out.println("Preco total = " + precoTotal);
	}

}
