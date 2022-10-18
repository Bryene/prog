package br.edu.femass.gui;
import br.edu.femass.dao.*;
import br.edu.femass.model.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;

public class GuiDevolucao {
    private JList lstDev;
    private javax.swing.JPanel JPanel;
    private JComboBox<Aluno> cboAlunos;
    private JComboBox<Professor> cboProfessores;
    private JButton  btnDevolucao;
    private JButton atrasosButton;

    public JPanel getJPanel() {
        return JPanel;
    }

    public GuiDevolucao() {

        btnDevolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Emprestimo emprestimo= (Emprestimo) lstDev.getSelectedValue();
                    new DaoEmprestimo().save(emprestimo);
                    updateList();
                } catch (Exception ex) { JOptionPane.showMessageDialog(null, ex.getMessage());
                    throw new RuntimeException(ex);
                }
            }
        });


        updateList();
        updateCombo();
        updateCombo2();

        lstDev.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Emprestimo emprestimo = (Emprestimo) lstDev.getSelectedValue();
                if (emprestimo == null) return;
            }
        });
        updateList();
        lstDev.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        btnDevolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        atrasosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiPRINCIPAL guiPRINCIPAL = new GuiPRINCIPAL();
                JFrame frame = new JFrame("Tela de atrasos");
                frame.setContentPane(guiPRINCIPAL.getJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    private void updateList() {
        try {
            List<Emprestimo> emprestimos = new DaoEmprestimo().getAll();
            lstDev.setListData(emprestimos.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void updateCombo() {
        try {
            List<Aluno> alunos= new DaoAluno().getAll();
            for (Aluno aluno: alunos) {
                cboAlunos.addItem(aluno);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void updateCombo2() {
        try {
            List<Professor> professores = new DaoProfessor().getAll();
            for (Professor professor : professores) {
                cboProfessores.addItem(professor);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}




