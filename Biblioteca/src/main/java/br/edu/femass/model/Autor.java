package br.edu.femass.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
                " || " + "Sobrenome: " + this.sobrenome +
                " || " + "Nacionalidade: " + this.nacionalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome)
                && Objects.equals(sobrenome, autor.sobrenome)
                && Objects.equals(nacionalidade, autor.nacionalidade);

    }
}
