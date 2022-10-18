package br.edu.femass.gui;

import br.edu.femass.dao.DaoAluno;
import br.edu.femass.dao.DaoExemplar;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.model.Aluno;
import br.edu.femass.model.Exemplar;
import br.edu.femass.model.Livro;
import br.edu.femass.model.Professor;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

public class GuiExemplar {
    private javax.swing.JPanel JPanel;
    private JComboBox<Livro> cbolivros;
    private JButton btnsalvarexemplar;
    private JList lstexemplar;
    public GuiExemplar() {

        btnsalvarexemplar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                        Livro livro = (Livro) lstexemplar.getSelectedValue();
                        Exemplar exemplar = new Exemplar(LocalDate.now(), livro);
                        new DaoExemplar().save(exemplar);
                        JOptionPane.showMessageDialog(null, "Confirmado");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }


            }
        });

        updateList();
        updateCombo();
        lstexemplar.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Livro livro = (Livro) lstexemplar.getSelectedValue();
                    if (livro==null) return;
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    private void updateList() {
        try {
            List<Livro> livros = new DaoLivro().getAll();
            lstexemplar.setListData(livros.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void updateCombo() {
        try {
            List<Livro> livros= new DaoLivro().getAll();
            for (Livro livro: livros) {
                cbolivros.addItem(livro);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public JPanel getJPanel() {
        return JPanel;
    }
}
