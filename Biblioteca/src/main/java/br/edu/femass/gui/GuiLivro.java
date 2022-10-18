package br.edu.femass.gui;

import br.edu.femass.dao.DaoAutor;
import br.edu.femass.dao.DaoExemplar;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.model.Autor;
import br.edu.femass.model.Exemplar;
import br.edu.femass.model.Livro;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiLivro {
    private javax.swing.JPanel JPanel;
    private JFormattedTextField txttitulo;
    private JButton btnRegistrarLivro;
    private JList lstal;
    private JButton btnExemplar;
    private JComboBox<Exemplar> cboExemplares;

    public JPanel getJPanel() {
        return JPanel;
    }



    public GuiLivro() {


        btnRegistrarLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Autor autor = (Autor) lstal.getSelectedValue();
                    Livro livro = new Livro(txttitulo.getText(), autor);
                    livro.atualizarCodigo();
                    new DaoLivro().save(livro);
                    JOptionPane.showMessageDialog(null, "Cadastrado");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        updateList();
        updateCombo();

        lstal.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent ListSelectionEvent) {
                try {
                    Autor autor = (Autor) lstal.getSelectedValue();
                    if(autor==null) return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        });

        btnExemplar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiExemplar guiExemplar = new GuiExemplar();
                JFrame frame = new JFrame("Cadastro Exemplar");
                frame.setContentPane(guiExemplar.getJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    private void updateList() {
        try {
            List<Autor> autores = new DaoAutor().getAll();
            lstal.setListData(autores.toArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void updateCombo() {
        try {
            List<Exemplar> Exemplares= new DaoExemplar().getAll();
            for (Exemplar exemplar: Exemplares) {
                cboExemplares.addItem(exemplar);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
