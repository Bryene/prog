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
import java.util.ArrayList;
import java.util.List;

public class GuiEmprestimo {
    private javax.swing.JPanel JPanel;
    private JList lstemprestimo;
    private JButton btnEMPRESTIMO;
    private JList lstleitor;


    public JPanel getJPanel() {
        return JPanel;
    }

    public GuiEmprestimo() {

        updateList();

        btnEMPRESTIMO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Leitor leitor = (Leitor) lstleitor.getSelectedValue();
                    Exemplar exemplar = (Exemplar) lstemprestimo.getSelectedValue();
                    Emprestimo emprestimo = new Emprestimo(exemplar, leitor);
                    new DaoEmprestimo().save(emprestimo);
                    JOptionPane.showMessageDialog(null, "Realizado");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
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

    private void updateList() {
        try {
            List<Leitor> leitores = new ArrayList<>();
            List<Professor> professores = new DaoProfessor().getAll();
            List<Exemplar> exemplares = new DaoExemplar().getAll();
            List<Aluno> alunos = new DaoAluno().getAll();
            leitores.addAll(alunos);
            leitores.addAll(professores);
            this.lstemprestimo.setListData(exemplares.toArray());
            this.lstleitor.setListData(leitores.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
