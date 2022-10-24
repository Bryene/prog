package br.edu.femass.gui;
import br.edu.femass.dao.*;
import br.edu.femass.model.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class GuiAtrasos{
        private JList lstatrasos;
        private javax.swing.JPanel JPanel;
        private JButton analisadoButton;
        private JTextField txtNome;
        private JTextField txtExemplar;
        private JTextField txtDataEmprestimo;
        private JTextField txtDataPrevista;
        private JPanel jPanel;

        public JPanel getjPanel() {
            return jPanel;
        }

        public GuiAtrasos() {
            updateList();
            lstatrasos.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    Emprestimo atrasado = (Emprestimo) lstatrasos.getSelectedValue();;
                    txtExemplar.setText(atrasado.getExemplar().toString());
                    txtDataEmprestimo.setText(atrasado.getDataEmprestimo().toString());
                    txtDataPrevista.setText(atrasado.getDataPrevistaDevolucao().toString());
                }
            });
            analisadoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Leitor leitor= (Leitor) lstatrasos.getSelectedValue();
                        new DaoLeitor().save(leitor);
                    } catch (Exception ex) { JOptionPane.showMessageDialog(null, ex.getMessage());
                        throw new RuntimeException(ex);
                    }
                }
            });
        }

        private void updateList() {
            try {

                List<Leitor> leitores = new ArrayList<>();
                lstatrasos.setListData(leitores.toArray());
                leitores.addAll(leitores);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            }


    public JPanel getJPanel() {
        return JPanel;
    }

    }


