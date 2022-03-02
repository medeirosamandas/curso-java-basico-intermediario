package com.amanda.cursojava.aula43.labs;

public abstract class Contribuinte {
	
	protected String nome;
	protected double renda;
	
	
	
	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public abstract double calcularIR();
	

    @Override
    public String toString() {
        String s = "Nome: " + nome;
        s += " ;rendaBruta: " + renda;
        return s;
    }

}
