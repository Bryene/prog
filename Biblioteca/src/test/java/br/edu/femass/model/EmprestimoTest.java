package br.edu.femass.model;
import br.edu.femass.dao.DaoAluno;
import br.edu.femass.dao.DaoProfessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
public class EmprestimoTest {



    @Test
    void Emprestimo() {
        Emprestimo emprestimo= new Emprestimo();
        LocalDate dataEsperada = LocalDate.now();
        Assertions.assertEquals(dataEsperada, emprestimo.LocalDate.now());
        emprestimo.setDataEmprestimo(LocalDate.now());
        String expected = "Realizado";
        Assertions.assertEquals(expected, "Realizado");

    }
}