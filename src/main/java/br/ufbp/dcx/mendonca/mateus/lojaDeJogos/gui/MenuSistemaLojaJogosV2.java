package br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui;

import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.LojaJogos;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui.controllers.CadastrarJogoController;

import javax.swing.*;
import java.awt.*;

public class MenuSistemaLojaJogosV2 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon lojaImg = new ImageIcon("imgs/loja.png");
    ImageIcon addJogo = new ImageIcon("imgs/icons/add-icon.png");
    ImageIcon pesqJogo = new ImageIcon("imgs/icons/search-icon.png");
    ImageIcon removeJogo = new ImageIcon("imgs/icons/remove-icon.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    LojaJogos lojaJogos = new LojaJogos;

    public MenuSistemaLojaJogosV2() {
        setTitle("Sistema Lojas de Jogos");
        setSize(800,600);
        setLocation(150,150);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        linha1 = new JLabel("Sistema de Estoque da Loja", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Tahoma", Font.BOLD, 24));
        linha2 = new JLabel(lojaImg, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar", addJogo);
        botaoAdicionar.addActionListener(new CadastrarJogoController(lojaJogos, this));
        botaoPesquisar = new JButton("Pesquisar", pesqJogo);
        botaoRemover = new JButton("Remover", removeJogo);
    }
}
