package br.edu.femass.model;
import java.time.LocalDate;

public class Emprestimo {

    public java.time.LocalDate LocalDate; //emprestimo teste
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao = null;
    private LocalDate dataDevolucao;

    public Emprestimo() {

    }
    private Exemplar exemplar;
    private Exemplar Emprestimo;
    public Emprestimo(Exemplar exemplar, Leitor leitor) {
        this.exemplar = exemplar;
        this.Emprestimo = this.getExemplar();
        //data do dia
        this.dataEmprestimo = LocalDate.now();
        this.dataPrevistaDevolucao = LocalDate.now().plusDays(leitor.getPrazoMaximoDevolucao());

    }

    public Exemplar getExemplar() {
        return exemplar;
    }
    private Leitor leitor;
    private Livro livro;
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;}

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "[Exemplar] || " + getExemplar()+
                "||" +
                "Data de Devolucao: " + getDataPrevistaDevolucao();
    }

}
