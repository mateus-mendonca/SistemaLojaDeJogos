package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestaJanelaDaLoja {
//    public static void main(String[] args) {
//        JFrame janela = new JogoGUI();
//        janela.setVisible(true);
//        WindowListener fechadorDaJanelaPrincipal = new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        };
//       janela.addWindowListener(fechadorDaJanelaPrincipal);
//    }
    public static void main(String[] args) {
        JFrame janela = new JogoGUIV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
