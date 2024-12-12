package org.example;

public class Alimento {

    private static int geradorCodigo =1;
    private int codigo;
    private String nome;
    private int nutricao;

    public Alimento(String nome, int nutricao){
        this.codigo = geradorCodigo++;
        this.nome = nome;
        this.nutricao = nutricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNutricao() {
        return nutricao;
    }
}
