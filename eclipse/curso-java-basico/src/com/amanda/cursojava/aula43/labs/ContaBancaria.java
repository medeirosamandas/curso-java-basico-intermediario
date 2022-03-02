package com.amanda.cursojava.aula43.labs;

public class ContaBancaria {
	
	protected String nomeCliente;
	protected String numConta;
	protected double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double dinheiro) {
		if (saldo - dinheiro >= 0) {
			saldo -= dinheiro;
			System.out.println("Saque efetuado com sucesso");
		}else {
			System.out.println("Impossível sacar, valor não disponível");
		}
	}
	
	public void depositar(double dinheiro) {
		saldo += dinheiro;
	}
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	

}
