package br.edu.femass.model;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private String nome;
    private String sobrenome;
    private String nacionalidade;



    public Autor() {

    }

    public Autor(String nome, String sobrenome, String nacionalidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setSobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getSobreNome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Nome do autor: " + this.nome +
                " || " + "Sobrenome: " +this.sobrenome+
                " || " + "Nacionalidade: " + this.nacionalidade;
    }


}
