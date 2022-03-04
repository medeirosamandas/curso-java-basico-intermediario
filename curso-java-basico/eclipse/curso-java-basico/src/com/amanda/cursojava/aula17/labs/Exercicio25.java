package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*O Sr Manoel Joaquim expandiu seus neg�cios para al�m dos neg�cios de 1,699 e agora possui uma loja de conveni�ncias. F�a um programa que implemete uma caixa registaradora rudimentar. O programa dever� 
 * receber um n�mero desconhecido de valores referentes aos pre�os das mercadorias. Um valor zero deve ser informado pelo ioperador para indicar o final da compra. O programa deve ent�o mostrar o total da 
 * compra e perguntar o valor em dinheiro que o cliente forneceu, para ent�o calcular e mostrar o valor do troco. Ap�s esta opera��o, o programa dever� voltar ao ponto inicial, para registrar a pr�xima
 * compra. A sa�da deve er conforme o exemplo abaixo:
 * 
 * Lojas Tabajara
 * Produto 1: R$ 2.20
 * Produto 2: R$ 5.80
 * Produto 3: R$ 0
 * Total: R$ 9.00
 * Dinheiro R$ 20.00
 * Troco: R$ 11.00*/


public class Exercicio25 {
	
	  public static void main(String[] args){
	        
	        Scanner scan = new Scanner(System.in);
	        
	        //System.out.println("Lojas Tabajara");
	        
	        boolean sair = false;
	        String continuarCompra;
	        int qtdProdutos;
	        double preco;
	        double total;
	        String output;
	        double valorPago, troco;
	        
	        do {
	            
	            System.out.println("Deseja informar uma nova compra? S/N");
	            continuarCompra = scan.next();
	            
	            if (continuarCompra.equalsIgnoreCase("s")){
	                
	                output = "Lojas Tabajara\n";
	                
	                System.out.println("Digite a quantidade de produtos da compra:");
	                qtdProdutos = scan.nextInt();
	                
	                total = 0;
	                
	                for (int i=1; i<=qtdProdutos; i++){
	                    System.out.println("Informe pre�o do produto " + i);
	                    preco = scan.nextDouble();
	                    total += preco;
	                    output += "Produto " + i + ": R$ " + preco + "\n";
	                }
	                
	                output += "Total: R$ " + total;
	                
	                System.out.println("Total: R$ " + total);
	                
	                System.out.println("Entre com o valor pago:");
	                valorPago = scan.nextDouble();
	                
	                output += "Dinheiro: R$ " + valorPago + "\n";
	                
	                troco = total - valorPago;
	                
	                output += "Troco: R$ " + troco;
	                
	                System.out.println(output);
	                
	            } else {
	                sair = true;
	            }
	           
	        }while(!sair);
	    }

}
