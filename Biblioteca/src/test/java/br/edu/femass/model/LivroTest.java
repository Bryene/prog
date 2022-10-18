package br.edu.femass.model;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void getTitulo() {
        Autor autor = new Autor("Francisco", "Neves", "brasileiro");
        Livro livro = new Livro("Rosas azuis",autor);
        String esperado = "Rosas azuis";
        Assertions.assertEquals(esperado, livro.getTitulo());
    }


    @Test
    void getCodigo() {
        Autor autor = new Autor("Francisco", "Neves", "brasileiro");
        Livro livro = new Livro("Rosas azuis",autor);
        long esperado =  4;
        Assertions.assertEquals(esperado, livro.getCodigo());
    }

    @Test
    void testToString() {
        Autor autor = new Autor("Francisco", "Neves", "brasileiro");
        Livro livro = new Livro("Rosas azuis", autor);
        String esperado = "Titulo do livro: Rosas azuis || Nome do autor: Francisco || Sobrenome: Neves || Nacionalidade: brasileiro";
        Assertions.assertEquals(esperado, livro.toString());
    }
}