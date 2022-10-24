package br.edu.femass.gui;
import br.edu.femass.dao.DaoAluno;
import br.edu.femass.dao.DaoEmprestimo;
import br.edu.femass.dao.DaoExemplar;
import br.edu.femass.dao.DaoProfessor;
import br.edu.femass.model.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GuiEmprestimo {
    private javax.swing.JPanel JPanel;
    private JList lstemprestimo;
    private JButton btnEMPRESTIMO;
    private JList lstleitor;
    private JList lstExemplar;


    public JPanel getJPanel() {
        return JPanel;
    }

    public GuiEmprestimo() {

        updateleitores();
        updateexemplares();

        btnEMPRESTIMO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Emprestimo emprestimo = new Emprestimo((Exemplar) lstemprestimo.getSelectedValue(), (Leitor) lstleitor.getSelectedValue());
                    Leitor leitor = (Leitor) lstleitor.getSelectedValue();
                    Exemplar exemplar = (Exemplar) lstemprestimo.getSelectedValue();
                    new DaoEmprestimo().save(emprestimo);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(null, "Realizado");
            }
        });
        lstemprestimo.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Exemplar exemplar = (Exemplar) lstemprestimo.getSelectedValue();
                if (exemplar==null) return;
            }
        });

        lstleitor.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Leitor leitor = (Leitor) lstleitor.getSelectedValue();
                if (leitor==null) return;
            }
        });
    }
    public  void  updateleitores(){
        try{
            List<Aluno> alunos = new  DaoAluno().getAll();
            List<Professor> professores = new  DaoProfessor().getAll();
            List<Leitor> leitores = new  ArrayList <>();
            leitores.addAll( alunos );
            leitores.addAll( professores );
            this.lstleitor.setListData (leitores.toArray ());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private void updateexemplares() {
        try {
            List<Exemplar> exemplares = new DaoExemplar().getAll();
            this.lstemprestimo.setListData(exemplares.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



