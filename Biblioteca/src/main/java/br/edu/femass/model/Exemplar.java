package br.edu.femass.model;
import java.text.DateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exemplar {

    private Long codigo;
    private LocalDate data;
    private static Long proximoC = 5L;
    private Livro livro;


    public Exemplar(LocalDate data, Livro livro) {
        this.livro = livro;
        this.data= LocalDate.now(Clock.systemDefaultZone());
        this.codigo = proximoC;
        proximoC++;
    }

    public Exemplar() {

    }


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getdataaquisicao() {
        return data;
    }

    public void setdataaquisicao(LocalDate data) {
        this.data= data;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return  + getCodigo()+ " || " + this.getLivro().getTitulo()+
                " || " +
                "Data de Aquisição: " + this.data;
    }

}
