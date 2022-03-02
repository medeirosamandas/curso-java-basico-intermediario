package com.amanda.cursojava.aula43.labs;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	
		
	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	public void sacar(double dinheiro) {
		if((limite + saldo) - dinheiro >= 0) {
			saldo -= dinheiro;
		}else {
			System.out.println("Limite indisponível.");
		}
	}



	@Override
	public String toString() {
		return super.toString() +
		 "ContaEspecial [limite=" + limite + "]";
	}
	
	
}
