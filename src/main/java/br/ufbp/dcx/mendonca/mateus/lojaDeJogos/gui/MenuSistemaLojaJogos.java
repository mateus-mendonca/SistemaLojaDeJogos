package br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui;

import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.SistemaLojaJogos;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui.controllers.*;

import javax.swing.*;
import java.awt.*;

public class MenuSistemaLojaJogos extends JFrame {

    JLabel linha1, linha2;
    ImageIcon lojaImg = new ImageIcon("imgs/loja.png");
    SistemaLojaJogos sistema = new SistemaLojaJogos();
    JMenuBar barraDeMenu = new JMenuBar();

    public MenuSistemaLojaJogos() {
        setTitle("Sistema de Loja de Jogos");
        setSize(800, 600);
        setLocation(150,150);
        setResizable(false);
        setBackground(Color.white);
        linha1 = new JLabel("Sistema de Estoque da Loja", JLabel.CENTER);
        linha1.setForeground(Color.blue);
        linha1.setFont(new Font("Tahoma", Font.BOLD, 24));
        linha2 = new JLabel(lojaImg, JLabel.CENTER);
        setLayout(new GridLayout(3, 1));
        add(linha1);
        add(linha2);
        add(new JLabel());
        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem menuCadastrarJogo = new JMenuItem("Cadastrar Jogo");
        menuCadastrar.add(menuCadastrarJogo);
        menuCadastrarJogo.addActionListener(new CadastrarJogoController(sistema, this));
        barraDeMenu.add(menuCadastrar);
        setJMenuBar(barraDeMenu);
    }

    public static void main(String[] args) {
        JFrame janela = new MenuSistemaLojaJogos();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
