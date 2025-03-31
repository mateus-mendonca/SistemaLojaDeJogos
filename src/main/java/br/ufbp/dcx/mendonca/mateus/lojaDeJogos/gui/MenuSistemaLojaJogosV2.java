package br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui;

import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.LojaJogos;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.SistemaLojaJogos;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui.controllers.CadastrarJogoController;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui.controllers.ProcurarJogoController;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui.controllers.RemoverJogoController;

import javax.swing.*;
import java.awt.*;

public class MenuSistemaLojaJogosV2 extends JFrame {
    JLabel linha1, linha2, linha3;
    ImageIcon lojaImg = new ImageIcon("imgs/sistemaLojaJogos.png");
    ImageIcon addJogo = new ImageIcon("imgs/icons/add-icon.png");
    ImageIcon pesqJogo = new ImageIcon("imgs/icons/search-icon.png");
    ImageIcon removeJogo = new ImageIcon("imgs/icons/remove-icon.png");
    ImageIcon controleImg = new ImageIcon("imgs/icons/controle.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    SistemaLojaJogos sistema = new SistemaLojaJogos();

    public MenuSistemaLojaJogosV2() {
        setTitle("Sistema Lojas de Jogos");
        setSize(800,600);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(171, 251, 255));
        linha1 = new JLabel("Sistema de Estoque da Loja", JLabel.CENTER);
        linha1.setFont(new Font("Arial", Font.BOLD, 24));
        linha1.setForeground(new Color(255, 255, 255));
        linha2 = new JLabel(lojaImg, JLabel.CENTER);
        linha3 = new JLabel(controleImg, JLabel.CENTER);

        botaoAdicionar = new JButton("Adicionar novo jogo", addJogo);
        botaoAdicionar.setFont(new Font("Arial", Font.BOLD, 16));
        botaoAdicionar.addActionListener(new CadastrarJogoController(sistema, this));
        botaoAdicionar.setForeground(Color.black);
        botaoAdicionar.setBackground(new Color(237, 255, 255, 255));

        botaoPesquisar = new JButton("Pesquisar jogos", pesqJogo);
        botaoPesquisar.addActionListener(new ProcurarJogoController(sistema, this));
        botaoPesquisar.setFont(new Font("Arial", Font.BOLD, 16));
        botaoPesquisar.setForeground(Color.black);
        botaoPesquisar.setBackground(new Color(237, 255, 255, 255));

        botaoRemover = new JButton("Remover jogo", removeJogo);
        botaoRemover.addActionListener(new RemoverJogoController(sistema, this));
        botaoRemover.setFont(new Font("Arial", Font.BOLD, 16));
        botaoRemover.setForeground(Color.black);
        botaoRemover.setBackground(new Color(237, 255, 255, 255));
//        getContentPane().setLayout(new GridLayout(3,2,100,10));
//        getContentPane().setLayout(new FlowLayout(1,50,10));
//        getContentPane().setLayout(null);
//        linha1.setBounds(180, 50, 400, 100);
        linha2.setBounds(0,0,800,600);
        botaoAdicionar.setBounds(98, 250, 300, 100);
        botaoPesquisar.setBounds(402, 250, 300, 100);
        botaoRemover.setBounds(255, 360, 300, 100);
//        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(botaoRemover);
        getContentPane().add(linha2);
        getContentPane().add(new JLabel());

    }

    public static void main(String[] args) {
        JFrame janela = new MenuSistemaLojaJogosV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
