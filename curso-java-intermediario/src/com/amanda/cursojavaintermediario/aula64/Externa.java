package com.amanda.cursojavaintermediario.aula64;

public class Externa {

    private String texto = "texto externo";

    public class Interna{

        private String texto = "texto interno";

        public void imprimeTexto(){
            System.out.println(texto);

            //consegue ver membros da classe externa
            System.out.println(Externa.this.texto);
        }
    }

    public static void main(String[] args){

        Externa externa = new Externa();

        //necessário uma instância da classe externa primeiro
        // já que a classe interna não é estática
        Interna interna = externa.new Interna();

        interna.imprimeTexto();
    }
}
