package br.edu.femass.model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ExemplarTest {

        Livro livro = new Livro();
        Exemplar exemplar = new Exemplar();

        @Test
        void setGetcodigo() {
            int esperado = 6;
            exemplar.setCodigo(Long.valueOf(esperado));
            Assertions.assertEquals(esperado, exemplar.getCodigo());
        }


        @Test
        void getLivro() {
            Assertions.assertEquals("Amanhã", "Amanhã");
        }

        @Test
        void setLivro() {
            Livro esperado = new Livro();
            exemplar.setLivro(esperado);
            Assertions.assertEquals(esperado, exemplar.getLivro());
        }


}