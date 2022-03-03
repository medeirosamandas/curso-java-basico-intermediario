package com.amanda.cursojava.aula46.labs;

public class Piramide extends Figura3D {

	  	private double altura;
	    private double arestaBase;
	    private double apotema;
	    private int numPoliBase; 
	    private Figura2D base;
	    
	    public void setNumPoliBase(int numPoliBase) {
	        this.numPoliBase = numPoliBase;
	    }

	    public int getNumPoliBase() {
	        return numPoliBase;
	    }


	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }


	    public double getArestaBase() {
	        return arestaBase;
	    }

	    public void setArestaBase(double arestaBase) {
	        this.arestaBase = arestaBase;
	    }

	    public double getApotema() {
	        return apotema;
	    }

	    /**
	     * @param apotema the apotema to set
	     */
	    public void setApotema(double apotema) {
	        this.apotema = apotema;
	    }

	    /**
	     * @return the base
	     */
	    public Figura2D getBase() {
	        return base;
	    }

	    /**
	     * @param base the base to set
	     */
	    public void setBase(Figura2D base) {
	        this.base = base;
	    }

	    @Override
	    public double calcularArea() {
	        if (base != null){
	            return (numPoliBase * ((arestaBase*apotema)/2)) + base.calcularArea();
	        }
	        return 0;
	    }

	    @Override
	    public double calcularVolume() {
	        if (base != null){
	           return (base.calcularArea() * altura)/3; 
	        }
	        return 0;
	    }

}
