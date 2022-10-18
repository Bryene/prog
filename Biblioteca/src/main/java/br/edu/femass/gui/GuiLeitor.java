package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLeitor {
    private javax.swing.JPanel JPanel;
    private JButton btnCadprof;
    private JButton btnCadaluno;

    public JPanel getjPanel() {
        return JPanel;
    }

    public GuiLeitor() {
        btnCadprof.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiProfessor guiProfessor = new GuiProfessor();
                JFrame frame = new JFrame("Professor");
                frame.setContentPane(guiProfessor.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        btnCadaluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAluno guiAluno = new GuiAluno();
                JFrame frame = new JFrame("Aluno");
                frame.setContentPane(guiAluno.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });

    }

    public static void main(String[] args) {
        GuiLeitor guiLeitor = new GuiLeitor();
        JFrame frame = new JFrame("Leitor");
        frame.setContentPane(guiLeitor.JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public JPanel getJPanel() {
        return JPanel;
    }
}
