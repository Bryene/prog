package br.edu.femass.model;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Emprestimo {

    public java.time.LocalDate LocalDate; //emprestimo teste
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao = null;
    private LocalDate dataDevolucao;
    private Leitor leitor;

    public Emprestimo() {

    }

    public Emprestimo(Exemplar exemplar, Leitor leitor) {
        this.exemplar = exemplar;
        this.leitor = leitor;
        this.Emprestimo = this.getExemplar();
        //data do dia
        this.dataEmprestimo = LocalDate.now();
        this.dataPrevistaDevolucao = LocalDate.now().plusDays(leitor.getPrazoMaximoDevolucao());

    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Leitor getLeitor() {
        return leitor;
    }
    private Exemplar exemplar;

    //exemplar recebe os parametros de emprestimo
    private Exemplar Emprestimo;
    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    @Override
    public String toString() {
        return "[Exemplar] || " +  exemplar.livro.getTitulo() +
                "||" +
                "Data de Devolucao: " + getDataPrevistaDevolucao();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return Objects.equals(dataEmprestimo, that.dataEmprestimo)
                && Objects.equals(dataPrevistaDevolucao, that.dataPrevistaDevolucao)
                && Objects.equals(dataDevolucao, that.dataDevolucao)
                && Objects.equals(exemplar, that.exemplar)
                && Objects.equals(leitor, that.leitor);
    }
}
