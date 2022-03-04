package com.amanda.cursojava.aula27.labs;

public class ContaCorrente {
	
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;
    
    void realizarSaque(double saque) {
    	if(!especial) {
    		if(saldo - saque >= 0) {
    			saldo -= saque;
    			System.out.println("Saque efetuado com sucesso!");
    			System.out.println("Novo saldo: " + saldo);
    		}else {
    			System.out.println("Imposs�vel efetuar o saque, valor indispon�vel");
    		}
    		
    	}else {
    		if(saldo + limiteEspecial - saque >=0) {
    			
    			saldo -= saque;
    			System.out.println("Saque efetuado com sucesso!");
    			System.out.println("Novo saldo: " + saldo);
    			
    		}else {
    			System.out.println("Imposs�vel efetuar o saque, valor indispon�vel");

    		}
    	}
    }
    void depositarDinheiro(double dinheiro) {
    	saldo += dinheiro;
    	System.out.println("Dep�sito efetudo com sucesso!");
    }
    void consultarSaldo() {
    	System.out.println("O saldo da sua conta corrente � de: R$" + saldo);
    }
    void verificarLimiteEspecial() {
    	if(especial) {
    		System.out.println("O seu limite especial � de R$" + limiteEspecial);
    	}else {
    		System.out.println("Voc� n�o possui limite especial");
    	}
    }

}
