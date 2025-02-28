package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class JogoGUI extends JFrame {
    public JogoGUI() {
        setTitle("TT Games");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
    }
}
