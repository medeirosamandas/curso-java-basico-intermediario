package com.amanda.cursojava.aula27.labs;

import com.amanda.cursojava.aula27.labs.ContaCorrente;

/*Crie uma classe para representar uma conta corrente que possui um n�mero, um saldo, um status que informa
 * se ela � especial ou n�o, um limite. Desenvolva m�todos para realizar saque(verificando se o cliente pode
 * realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente est� usando cheque especial
 * ou n�o. Desenvolva um programa para testar a classe*/

public class Exercicio02 {

	public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        
        conta.depositarDinheiro(40);
        conta.consultarSaldo();
        conta.realizarSaque(20);
        conta.verificarLimiteEspecial();
        
        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
	}

}
