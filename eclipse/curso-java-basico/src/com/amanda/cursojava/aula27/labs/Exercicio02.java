package com.amanda.cursojava.aula27.labs;

import com.amanda.cursojava.aula27.labs.ContaCorrente;

/*Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa
 * se ela é especial ou não, um limite. Desenvolva métodos para realizar saque(verificando se o cliente pode
 * realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial
 * ou não. Desenvolva um programa para testar a classe*/

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
