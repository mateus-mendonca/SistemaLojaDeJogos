package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SistemaLojaJogos implements LojaJogos {

    private Collection<Jogo> jogos;

    public SistemaLojaJogos() {
        jogos = new ArrayList<Jogo>();
    }

    public void cadastraJogo(String titulo, String descricao, Genero genero, int preco, int quantidade) throws JogoJaExisteException {
        if (jogos.contains(titulo)) {
            throw new JogoJaExisteException("Jogo já cadastrado.");
        } else {
            Jogo jogo = new Jogo(titulo, descricao, genero, preco, quantidade);
            jogos.add(jogo);
        }
    }

    public Collection<Jogo> pesquisaJogoPelaDescricao(String descricao) throws JogoInexistenteException{
        Collection<Jogo> jogoPelaDescricao = new ArrayList();
        for (Jogo j : jogos) {
            if (j.getDescricao().equals(descricao)) {
                jogoPelaDescricao.add(j);
            } else {
                throw new JogoInexistenteException("Nenhum jogo encontrado com essa descrição.");
            }
        }
        return jogoPelaDescricao;
    }

    public Collection<Jogo> pesquisaJogosPeloGenero(Genero genero) throws JogoInexistenteException{
        Collection<Jogo> jogoPeloGenero = new ArrayList<>();
        for (Jogo j : jogos) {
            if (j.getGenero().equals(genero)) {
                jogoPeloGenero.add(j);
            } else {
                throw new JogoInexistenteException("Nenhum jogo encontrado com o gênero: "+genero+".");
            }
        }
        return jogoPeloGenero;
    }

    public void removeJogo(String titulo) throws JogoInexistenteException {
        Collection<Jogo> jogoEncontrado = new ArrayList();
        for (Jogo j : jogos) {
            if (j.getTitulo().equals(titulo)) {
                jogoEncontrado.remove(jogos);
            } else {
                throw new JogoInexistenteException("Jogo não encontrado.");
            }
        }
    }

    public Genero consultaGeneroDoJogo(String titulo) throws JogoInexistenteException{
        return null;
    }

    public void alteraPrecoDoJogo(int preco, int novoPreco) {

    }
}
