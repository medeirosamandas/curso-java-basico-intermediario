package com.amanda.cursojava.aula24.labs;

/*Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se
 * ela é especial ou não, um limite*/

public class Exercicio05 {
	  
    public static void main(String[] args){
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        
        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    }

}
