package com.amanda.cursojavaintermediario.aula65;

public @interface InformacaoAula {
    String autor();
    int aulaNumero();
    String curso() default "Curso Java Intermediário";
}
