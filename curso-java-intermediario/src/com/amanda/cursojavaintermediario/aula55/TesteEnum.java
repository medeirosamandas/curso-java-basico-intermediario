package com.amanda.cursojavaintermediario.aula55;

import com.amanda.cursojavaintermediario.aula54.DiaSemana;

public class TesteEnum {

  public static void main(String[] args) {
    DiaSemana[] dias = DiaSemana.values();

    for(int i = 0; i < dias.length; i++){
      System.out.println(dias[i]);
    }
    System.out.println();
    for (DiaSemana dia : dias){
      System.out.println(dia);
    }
  }

}
