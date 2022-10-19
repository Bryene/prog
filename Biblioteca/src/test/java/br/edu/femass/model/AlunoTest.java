package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void setPrazoMaximoDevolucao() {
        Integer esperado = 15;
        Aluno aluno = new Aluno("Maria","Rua Francisco de Assis",
                "22 98123 8456", "2334456");
        Assertions.assertEquals(esperado, aluno.getPrazoMaximoDevolucao());


    }

    @Test
    void getMatricula() {
        Aluno aluno = new Aluno("Maria","Rua Francisco de Assis",
                "22 98123 8456","2334456"
        );
        String esperado = "2334456";
        Assertions.assertEquals(esperado, aluno.getMatricula());
    }

    @Test
    void setMatricula() {
        Aluno aluno = new Aluno("Maria", "Rua Francisco de Assis",
                "22 3445 3445", "123490");
        String esperado = "23787";
        aluno.setMatricula("23787");
        Assertions.assertEquals(esperado, aluno.getMatricula());
    }

    @Test
    void testToString() {
        Aluno aluno = new Aluno("Maria",  "Rua Francisco de Assis",
                "22 98345 3456", "20123489");
        Aluno esperado = new Aluno("Maria", "Rua Francisco de Assis",
                "22 98345 3456", "20123489");
        System.out.println(aluno.toString());
        System.out.println(esperado.toString());
        Assertions.assertEquals(esperado.toString(), aluno.toString());
    }
}