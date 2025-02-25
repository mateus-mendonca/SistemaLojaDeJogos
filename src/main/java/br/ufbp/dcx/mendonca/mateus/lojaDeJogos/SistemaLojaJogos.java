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

    public void cadastraJogo(String titulo, String descricao, String codigo, Genero genero, int preco, int quantidade) throws JogoJaExisteException {
        if (jogos.contains(codigo)) {
            throw new JogoJaExisteException("Jogo já cadastrado.");
        } else {
            Jogo jogo = new Jogo(titulo, descricao, codigo, genero, preco, quantidade);
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

    public void removeJogo(String codigo) throws JogoInexistenteException {
        Collection<Jogo> jogoEncontrado = new ArrayList();
        for (Jogo j : jogos) {
            if (j.getTitulo().equals(codigo)) {
                jogoEncontrado.remove(jogos);
            } else {
                throw new JogoInexistenteException("Jogo não encontrado.");
            }
        }
    }

    public Genero consultaGeneroDoJogo(String codigo) throws JogoInexistenteException{
        if (!this.jogos.contains(codigo)) {
            throw new JogoInexistenteException("Jogo não encontrado.");
        } else {
            Genero generoEncontrado = null;
            for (Jogo j : this.jogos) {
                generoEncontrado = j.getGenero();
            }
            return generoEncontrado;
        }
    }

    public void alteraPrecoDoJogo(String codigo, int novoPreco) throws JogoInexistenteException {
        if (!this.jogos.contains(codigo)) {
            throw new JogoInexistenteException("Jogo não encontrado.");
        } else {
            for (Jogo j : this.jogos) {
                j.setPreco(novoPreco);
            }
        }
    }

    public int consultaQuantidadeEmEstoque(String codigo) throws JogoInexistenteException {
        return 0;
    }
}
