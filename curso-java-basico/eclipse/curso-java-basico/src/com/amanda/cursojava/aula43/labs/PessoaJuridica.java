package com.amanda.cursojava.aula43.labs;

public class PessoaJuridica extends Contribuinte {
	private String cnpj;

	@Override
	public double calcularIR() {
		return renda * 0.1;
	}
	
    @Override
    public String toString() {
        String s = "Pessoa Jurídica[";
        s += super.toString();
        s += " ;cnpj: " + cnpj;
        s += " ;imposto a ser pago: " + calcularIR();
        s += "]";
        return s;
    }
}
