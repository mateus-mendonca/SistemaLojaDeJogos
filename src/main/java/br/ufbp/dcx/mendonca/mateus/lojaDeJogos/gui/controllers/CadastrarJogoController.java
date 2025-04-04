package br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui.controllers;

import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.Genero;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.JogoJaExisteException;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.LojaJogos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastrarJogoController implements ActionListener {

    private LojaJogos sistema;
    private JFrame janelaPrincipal;

    public CadastrarJogoController(LojaJogos sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }


    @Override
    public void actionPerformed(ActionEvent event) {
    try {
        String titulo = JOptionPane.showInputDialog(janelaPrincipal, "Digite o título do jogo ");
        String descricao = JOptionPane.showInputDialog(janelaPrincipal, "Digite a descrição do jogo ");
        String codigo = JOptionPane.showInputDialog(janelaPrincipal, "Digite o código do jogo ");
        Genero genero = Genero.valueOf(JOptionPane.showInputDialog(janelaPrincipal, "Digite o gênero do jogo (ACAO_AVENTURA, ACAO, AVENTURA, MISTERIO, TERROR, SUSPENSE, TIRO)"));
        int preco = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Digite o preço do jogo "));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Digite a quantidade em estoque do jogo "));
        sistema.cadastraJogo(titulo, descricao, codigo, genero, preco, quantidade);
        JOptionPane.showMessageDialog(janelaPrincipal, "Jogo cadastrado com sucesso!");
        } catch (JogoJaExisteException e) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro ao cadastrar o jogo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
