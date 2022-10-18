package br.edu.femass.gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAtendente{
    private javax.swing.JPanel JPanel;
    private JButton cadLeitor;
    private JButton btncademprestimo;
    private JButton btnDevolucao;


    public GuiAtendente() {

        cadLeitor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiLeitor guiLeitor = new GuiLeitor();
                JFrame frame = new JFrame("Leitor");
                frame.setContentPane(guiLeitor.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        btncademprestimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiEmprestimo guiEmprestimo = new GuiEmprestimo();
                JFrame frame = new JFrame("Emprestimo");
                frame.setContentPane(guiEmprestimo.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        btnDevolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiDevolucao guiDevolucao = new GuiDevolucao();
                JFrame frame = new JFrame("Devolução");
                frame.setContentPane(guiDevolucao.getJPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        GuiAtendente guiAtendente = new GuiAtendente();
        JFrame frame = new JFrame("Atendente");
        frame.setContentPane(guiAtendente.JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public JPanel getJPanel() {
        return JPanel;
    }
}
