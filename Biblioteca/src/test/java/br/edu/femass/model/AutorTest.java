package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutorTest {

    @Test
    void getNomeAutor() {
        Autor autor = new Autor("Bryene", "Fernandes", "Brasileira");
        String esperado = "Bryene";
        System.out.println(esperado);
        System.out.println(autor.toString());
        Assertions.assertEquals(esperado, autor.getNome());
    }

    @Test
    void setNomeAutor() {
        Autor autor = new Autor("Bryene","Fernandes",  "Brasileira"
        );
        autor.setNome("Maria");
        String esperado = "Maria";
        Assertions.assertEquals(esperado, autor.getNome());
    }

    @Test
    void getsobreNome() {
        Autor autor = new Autor("Bryene","Fernandes",  "Brasileira");
        String esperado = "Fernandes";
        Assertions.assertEquals(esperado, autor.getSobreNome());
    }

    @Test
    void setSobreNome() {
        Autor autor = new Autor( "Bryene","Fernandes",  "Brasileira");

        autor.setSobreNome("Gonçalves");
        String esperado = "Gonçalves";
        Assertions.assertEquals(esperado, autor.getSobreNome());
    }

    @Test
    void getNacionalidade() {
        Autor autor = new Autor( "Bryene","Fernandes",  "Brasileira");
        String esperado = "Brasileira";
        Assertions.assertEquals(esperado, autor.getNacionalidade());
    }

    @Test
    void setNacionalidade() {
        Autor autor = new Autor("Bryene","Fernandes",  "Brasileira");
        autor.setNacionalidade("Mexicana");
        String esperado = "Mexicana";
        Assertions.assertEquals(esperado, autor.getNacionalidade());
    }


    @Test
    void autorToString() {
        Autor autor = new Autor("Bryene","Fernandes",  "Brasileira");
        Autor esperado = new Autor("Bryene","Fernandes",  "Brasileira");
        Assertions.assertEquals(esperado.toString(), autor.toString());
    }
}