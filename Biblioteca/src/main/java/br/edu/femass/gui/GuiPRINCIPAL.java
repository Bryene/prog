package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  GuiPRINCIPAL {
    private javax.swing.JPanel JPanel;
    private JButton btnBibliotecario;
    private JButton btnAtendente;

    public JPanel getJPanel() {
        return JPanel;
    }

    public  GuiPRINCIPAL() {
        btnBibliotecario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiBibliotecario guiBibliotecario = new GuiBibliotecario();
                JFrame frame = new JFrame("Bibliotecario");
                frame.setContentPane(guiBibliotecario.getJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        btnAtendente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAtendente guiAtendente = new GuiAtendente();
                JFrame frame = new JFrame("Atendente");
                frame.setContentPane(guiAtendente.getJPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }


    public static void main(String[] args) {
       GuiPRINCIPAL  GuiPRINCIPAL = new  GuiPRINCIPAL();
        JFrame frame = new JFrame("Tela Inicial");
        frame.setContentPane( GuiPRINCIPAL.getJPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
