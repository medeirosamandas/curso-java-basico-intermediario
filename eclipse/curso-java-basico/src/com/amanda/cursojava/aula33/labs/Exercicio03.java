package com.amanda.cursojava.aula33.labs;

import java.util.Scanner;
//Reescreva este exercic�o utilizando o que foi aprendido nas �ltimas aulas,
//encapsulamento, modificadores de acesso, palavra chave this, construtores, etc

/*Escreva uma classe para representar um aluno. Adicione atributos relacionados �s caracter�sticas de um 
 * Aluno, como nome, matr�cula, curso que est� matriculado, nome de 3 disciplinas que est� cursando e as notas
 * destas 3 disciplinas. Desenvolva um m�todo para verificar se o aluno est� aprovado(Nota maior que 7) em uma
 * determinada disciplina. Escreva um programa um programa para testar essa classe, que pede as informa��es do aluno
 * ao usu�rio e ao final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou n�o*/

public class Exercicio03 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());
        
        System.out.println("Entre com o nome do curso");
        aluno.setNomeCurso(scan.next());
        
        System.out.println("Entre com a matricula");
        aluno.setMatricula(scan.next());
        
        //aluno.nomeDisciplinas = new String[3];
        for (int i=0; i<aluno.getNomeDisciplinas().length; i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinaPos(i, scan.next());
        }
        
        for (int i=0; i<aluno.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j=0; j<aluno.getNotasDisciplinas()[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.setNotaDisciplinaPosIJ(i, j, scan.nextDouble());
            }
        }
        
        aluno.mostrarInfo();
        
        for (int i=0; i<aluno.getNomeDisciplinas().length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado");
            }
        }
    }

}
