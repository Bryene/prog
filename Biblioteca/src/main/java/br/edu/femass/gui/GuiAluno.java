package br.edu.femass.gui;

import br.edu.femass.dao.DaoAluno;
import br.edu.femass.dao.DaoProfessor;
import br.edu.femass.model.Aluno;
import br.edu.femass.model.Professor;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiAluno {
    private JFormattedTextField txtNome;
    private JFormattedTextField txtEndereco;
    private JFormattedTextField txtTelefone;
    private javax.swing.JPanel JPanel;
    private JFormattedTextField txtMatricula;
    private JButton btnRegistrarAluno;
    private JList lstaluno;
    private JComboBox<Aluno> cboAlunos;

    public JPanel getJPanel() { return JPanel; }

    public GuiAluno() {
        updateList();
        updateCombo();
        btnRegistrarAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Aluno aluno = new Aluno(txtNome.getText(), txtEndereco.getText(),
                            txtTelefone.getText(), txtMatricula.getText());
                    new DaoAluno().save(aluno);
                    aluno.atualizarCodigo();
                    updateList();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        lstaluno.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Aluno aluno = (Aluno) lstaluno.getSelectedValue();
                if (aluno==null) return;
                txtNome.setText(aluno.getNome());
                txtEndereco.setText(aluno.getEndereco());
                txtTelefone.setText(aluno.getTelefone());
                txtMatricula.setText(aluno.getMatricula());
            }
        });
    }

    private void updateList() {
        try {
            List<Aluno> alunos = new DaoAluno().getAll();
            lstaluno.setListData(alunos.toArray());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
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


}
