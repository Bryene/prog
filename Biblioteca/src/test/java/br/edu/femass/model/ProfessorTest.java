package br.edu.femass.model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProfessorTest {

    @Test
    void setPrazoMaximoDevolucao() {
        Integer esperado = 30;
        Professor professor = new Professor("Mario",   "José",
                "22 999134578", "Ciências");
        Assertions.assertEquals(esperado, professor.getPrazoMaximoDevolucao());
    }

    @Test
    void getDisciplina() {
        Professor professor = new Professor("Mario",   "José",
                "22 999134578","Ciências");
        String esperado = "Ciências";
        Assertions.assertEquals(esperado, professor.getDisciplina());
    }

    @Test
    void setDisciplina() {
        Professor professor = new Professor("Mario",  "José",
                "22 999134578", "Ciências");
        String esperado = "Banco de dados";
        professor.setDisciplina("Banco de dados");
        Assertions.assertEquals(esperado, professor.getDisciplina());
    }
}