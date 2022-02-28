package com.amanda.cursojava.aula33.labs;

import java.util.Scanner;
//Reescreva este exercicío utilizando o que foi aprendido nas últimas aulas,
//encapsulamento, modificadores de acesso, palavra chave this, construtores, etc

/*Escreva uma classe para representar um aluno. Adicione atributos relacionados às características de um 
 * Aluno, como nome, matrícula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas
 * destas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado(Nota maior que 7) em uma
 * determinada disciplina. Escreva um programa um programa para testar essa classe, que pede as informações do aluno
 * ao usuário e ao final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não*/

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
