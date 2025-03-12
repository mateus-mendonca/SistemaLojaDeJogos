package br.ufbp.dcx.mendonca.mateus.lojaDeJogos.gui.controllers;

import br.ufbp.dcx.mendonca.mateus.lojaDeJogos.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Collection;

public class ProcurarJogoController implements ActionListener {
    private LojaJogos lojaJogos;
    private JFrame janelaPrincipal;

    public ProcurarJogoController(LojaJogos lojaJogos, JFrame janelaPrincipal) {
        this.lojaJogos = lojaJogos;
        this.janelaPrincipal = janelaPrincipal;
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        SistemaLojaJogos sistema = new SistemaLojaJogos();
        boolean continuar = true;
        while (continuar) {
            String opcao = JOptionPane.showInputDialog(janelaPrincipal, "Digite a opção desejada: \n" + "1 - Procurar por código. \n"
                    + "2 - Procurar por gênero. \n");
            switch (opcao) {
                case "1":
                    String codigo = JOptionPane.showInputDialog(janelaPrincipal, "Digite o codigo do jogo: ");
                    try {
                        JOptionPane.showMessageDialog(janelaPrincipal, "Jogo encontrado!" + sistema.pesquisaJogo(codigo));
                    } catch (JogoInexistenteException e) {
                        JOptionPane.showMessageDialog(janelaPrincipal, "Jogo inexistente!" + e.getMessage());
                    }
                    break;
                case "2":
                    Genero genero = Genero.valueOf(JOptionPane.showInputDialog(janelaPrincipal, "Digite o gênero a pesquisar (ACAO_AVENTURA, ACAO, AVENTURA, MISTERIO, TERROR, SUSPENSE, TIRO): "));
                    try {
                        Collection<Jogo> jogosEncontrados = sistema.pesquisaJogosPeloGenero(genero);
                        JOptionPane.showMessageDialog(janelaPrincipal, "Jogos encontrados: "+ jogosEncontrados);
                    } catch (JogoInexistenteException e) {
                        JOptionPane.showMessageDialog(janelaPrincipal, "Jogo inexistente!" + e.getMessage());
                    }
                    break;
            }
        }
    }
}
