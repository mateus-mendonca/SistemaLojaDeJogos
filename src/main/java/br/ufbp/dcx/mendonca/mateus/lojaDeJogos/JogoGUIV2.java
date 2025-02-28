package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import javax.swing.*;
import java.awt.*;

public class JogoGUIV2 extends JFrame {

    JLabel linha1, linha2;
    ImageIcon lojaImg = new ImageIcon("imgs/loja.png");
    public JogoGUIV2() {
        setTitle("TT Games");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        linha1 = new JLabel("TT Games", JLabel.CENTER);
        linha1.setForeground(Color.BLUE);
        linha1.setFont(new Font("Arial", Font.BOLD, 24));
        linha2 = new JLabel(lojaImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(2 ,1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }

}
