package com.amanda.cursojavaintermediario.aula56.labs;

public enum Operacao {
  SOMAR('+') {
    @Override
    public double executarOperacao(double x, double y) {
      return x + y;
    }
  }, SUBTRAIR('-') {
    @Override
    public double executarOperacao(double x, double y) {
      return x - y;
    }
  }, DIVIDIR('/') {
    @Override
    public double executarOperacao(double x, double y) {
      return x / y;
    }
  }, MULTIPLICAR('*') {
    @Override
    public double executarOperacao(double x, double y) {
      return x * y;
    }
  };

  private char simbolo;
  private double x;
  private double y;

  Operacao(char simbolo){
    this.simbolo = simbolo;
  }

  @Override
  public String toString() {
    return "" + simbolo;
  }



  public abstract double executarOperacao(double x, double y);
}



