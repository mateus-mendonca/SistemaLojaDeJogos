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
    ImageIcon lojaImg = new ImageIcon("imgs/loja.png");
    ImageIcon addJogo = new ImageIcon("imgs/icons/add-icon.png");
    ImageIcon pesqJogo = new ImageIcon("imgs/icons/search-icon.png");
    ImageIcon removeJogo = new ImageIcon("imgs/icons/remove-icon.png");
    ImageIcon controleImg = new ImageIcon("imgs/icons/controle.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    SistemaLojaJogos sistema = new SistemaLojaJogos();

    public MenuSistemaLojaJogosV2() {
        setTitle("Sistema Lojas de Jogos");
        setSize(800,500);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        linha1 = new JLabel("Sistema de Estoque da Loja", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Arial", Font.BOLD, 24));
        linha1.setForeground(new Color(5, 151, 229));
        linha2 = new JLabel(lojaImg, JLabel.CENTER);
        linha3 = new JLabel(controleImg, JLabel.CENTER);

        botaoAdicionar = new JButton("Adicionar", addJogo);
        botaoAdicionar.setFont(new Font("Arial", Font.BOLD, 24));
        botaoAdicionar.addActionListener(new CadastrarJogoController(sistema, this));
        botaoAdicionar.setForeground(Color.black);
        botaoAdicionar.setBackground(Color.white);

        botaoPesquisar = new JButton("Pesquisar", pesqJogo);
        botaoPesquisar.addActionListener(new ProcurarJogoController(sistema, this));
        botaoPesquisar.setFont(new Font("Arial", Font.BOLD, 24));
        botaoPesquisar.setForeground(Color.black);
        botaoPesquisar.setBackground(Color.white);

        botaoRemover = new JButton("Remover", removeJogo);
        botaoRemover.addActionListener(new RemoverJogoController(sistema, this));
        botaoRemover.setFont(new Font("Arial", Font.BOLD, 24));
        botaoRemover.setForeground(Color.black);
        botaoRemover.setBackground(Color.white);

        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(linha3);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }

    public static void main(String[] args) {
        JFrame janela = new MenuSistemaLojaJogosV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
