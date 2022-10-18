package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiBibliotecario {
    private JButton btnLivro;
    private javax.swing.JPanel JPanel;
    private JButton btnAutor;

    public JPanel getJPanel() {
        return JPanel;
    }

    public GuiBibliotecario() {

        btnLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    GuiLivro guiLivro = new GuiLivro();
                    JFrame frame = new JFrame("Cadastro de livro");
                    frame.setContentPane(guiLivro.getJPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
            }
        });

        btnAutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAutor guiAutor = new GuiAutor();
                JFrame frame = new JFrame("Cadastro de autor");
                frame.setContentPane(guiAutor.getJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });

    }
}
