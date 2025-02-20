package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SistemaLojaJogos implements LojaJogos {

    private Collection<Jogo> jogos;

    public SistemaLojaJogos() {
        jogos = new ArrayList<Jogo>();
    }

    public boolean cadastraJogo(String titulo, String descricao, Genero genero, int preco, int quantidade) throws JogoJaExisteException {
        if (jogos.contains(titulo)) {
            throw new JogoJaExisteException("Jogo já cadastrado.");
        } else {
            Jogo jogo = new Jogo(titulo, descricao, genero, preco, quantidade);
            jogos.add(jogo);
            return true;
        }
    }

    public Collection<Jogo> pesquisaJogoPelaDescricao(String descricao) {
        Collection<Jogo> jogoPelaDescricao = new ArrayList();
        for (Jogo j : jogos) {
            if (j.getDescricao().equals(descricao)) {
                jogoPelaDescricao.add(j);
            }
        }
        return jogoPelaDescricao;
    }

    public Collection<Jogo> pesquisaJogoPelaGenero(String genero) {
        return null;
    }

    public boolean removeJogo(String titulo) throws JogoInexistenteException {
        Collection<Jogo> jogoEncontrado = new ArrayList();
        for (Jogo j : jogos) {
            if (j.getTitulo().equals(titulo)) {
                jogoEncontrado.remove(jogos);
            } else {
                throw new JogoInexistenteException("Jogo não encontrado.");
            }
        }
        return true;
    }
}
