package br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui.controllers;

import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.Jogo;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.JogoInexistenteException;
import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.SistemaLojaJogos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoverJogoController implements ActionListener {

    private SistemaLojaJogos sistema;
    private JFrame janelaPrincipal;

    public RemoverJogoController(SistemaLojaJogos sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        String codigo = JOptionPane.showInputDialog(janelaPrincipal, "Digite o codigo do jogo a remover ");
        try {
            sistema.removeJogo(codigo);
        } catch (JogoInexistenteException e) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro ao remover o jogo " + e.getMessage());
        }
    }
}
