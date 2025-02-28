package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.*;
import java.util.*;

public class SistemaLojaJogos implements LojaJogos {

    private GravadorDeJogos gravadorDeJogos;
    private Map<String, Jogo> jogosMap;

    public SistemaLojaJogos() {
        this.jogosMap = new HashMap<>();
        this.gravadorDeJogos = new GravadorDeJogos();
    }

    public void cadastraJogo(String titulo, String descricao, String codigo, Genero genero, int preco, int quantidade) throws JogoJaExisteException {
        if (this.jogosMap.containsKey(codigo)) {
            throw new JogoJaExisteException("Jogo já cadastrado.");
        } else {
            Jogo jogo = new Jogo(titulo, descricao, codigo, genero, preco, quantidade);
            this.jogosMap.put(codigo, jogo);
        }
    }

    public Collection<Jogo> pesquisaJogoPelaDescricao(String descricao) throws JogoInexistenteException{
        Collection<Jogo> jogoPelaDescricao = new ArrayList();
        for (Jogo j : jogosMap.values()) {
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
        for (Jogo j : jogosMap.values()) {
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
        for (Jogo j : jogosMap.values()) {
            if (j.getTitulo().equals(codigo)) {
                jogoEncontrado.remove(jogosMap);
            } else {
                throw new JogoInexistenteException("Jogo não encontrado.");
            }
        }
    }

    public Genero consultaGeneroDoJogo(String codigo) throws JogoInexistenteException{
        if (!this.jogosMap.containsKey(codigo)) {
            throw new JogoInexistenteException("Jogo não encontrado.");
        } else {
            Genero generoEncontrado = null;
            for (Jogo j : this.jogosMap.values()) {
                generoEncontrado = j.getGenero();
            }
            return generoEncontrado;
        }
    }

    public void alteraPrecoDoJogo(String codigo, int novoPreco) throws JogoInexistenteException {
        if (!this.jogosMap.containsKey(codigo)) {
            throw new JogoInexistenteException("Jogo não encontrado.");
        } else {
            for (Jogo j : this.jogosMap.values()) {
                j.setPreco(novoPreco);
            }
        }
    }

    public int consultaQuantidadeEmEstoque(String codigo) throws JogoInexistenteException {
        if (!this.jogosMap.containsKey(codigo)) {
            throw new JogoInexistenteException("Jogo não encontrado.");
        } else {
            for (Jogo j : this.jogosMap.values()) {
                j.getQuantidade();
            }
            return jogosMap.size();
        }
    }

    public void recuperaRoupas () throws IOException, JogoJaExisteException {
        Collection<Jogo> jogosAchados = this.gravadorDeJogos.recuperarJogos();
        for (Jogo j: jogosAchados) {
            this.cadastraJogo(j.getTitulo(), j.getDescricao(), j.getCodigo(), j.getGenero(), j.getPreco(), j.getQuantidade());
        }
    }

    public void salvarRoupas () throws IOException {
        this.gravadorDeJogos.gravaJogos(this.jogosMap.values());
    }
}
