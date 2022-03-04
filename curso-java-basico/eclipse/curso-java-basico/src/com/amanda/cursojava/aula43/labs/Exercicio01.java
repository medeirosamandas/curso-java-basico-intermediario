package com.amanda.cursojava.aula43.labs;

/*Conta bancária
 * Elabore uma classe ContaBancaria com os seguintes atributos:
 * nomeCliente
 * numConta
 * saldo
 * 
 * E os seguinte métodos:
 * sacar (o saldo não pode ficar negativo)
 * depositar
 * 
 * Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial com as seguintes caracteristicas
 * ContaPoupanca
 * atributo diaRendimento
 * método calcularNovoSaldo, recebe taxa de rendimento da poupança e atualiza o saldo
 * ContaEspecial
 * atributo limite
 * sobrescreva o método sacar com a nova lógica necessária
 * 
 * Crie uma classe Teste que contenha a seguinte lógica:
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
