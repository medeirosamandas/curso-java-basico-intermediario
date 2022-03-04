package com.amanda.cursojava.aula43.labs;

/*Conta banc�ria
 * Elabore uma classe ContaBancaria com os seguintes atributos:
 * nomeCliente
 * numConta
 * saldo
 * 
 * E os seguinte m�todos:
 * sacar (o saldo n�o pode ficar negativo)
 * depositar
 * 
 * Crie tamb�m duas subclasses chamadas ContaPoupanca e ContaEspecial com as seguintes caracteristicas
 * ContaPoupanca
 * atributo diaRendimento
 * m�todo calcularNovoSaldo, recebe taxa de rendimento da poupan�a e atualiza o saldo
 * ContaEspecial
 * atributo limite
 * sobrescreva o m�todo sacar com a nova l�gica necess�ria
 * 
 * Crie uma classe Teste que contenha a seguinte l�gica:
 * Criar contas
 * Sacar um valor das contas
 * Depositar
 * Mostrar um novo saldo a partir de um rendimento
 * Mostrar os dados da conta do cliente*/

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		ContaPoupanca conta1 = new ContaPoupanca();
		ContaEspecial conta2 = new ContaEspecial();
		
		conta1.setNomeCliente("Maria");
		conta1.setNumConta("293847");
		conta1.saldo = 400;
		conta1.setDiaRendimento(4);
		
		conta2.setNomeCliente("Maria");
		conta2.setNumConta("293847");
		conta2.saldo = 400;
		conta2.setLimite(100);
		
		System.out.println(conta1.toString());
		System.out.println(conta2.toString());
		
		conta1.sacar(450);
		conta2.sacar(510);
		
		System.out.println(conta1.toString());
		System.out.println(conta2.toString());
	}

}
