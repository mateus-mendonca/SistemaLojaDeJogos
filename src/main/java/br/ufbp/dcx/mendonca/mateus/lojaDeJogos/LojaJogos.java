package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.IOException;
import java.util.Collection;

public interface LojaJogos {
    void cadastraJogo(String titulo, String descricao, Genero genero, int preco, int quantidade) throws JogoJaExisteException;
    Collection<Jogo> pesquisaJogosPeloGenero(Genero genero) throws JogoInexistenteException;
    Collection<Jogo> pesquisaJogoPelaDescricao(String descricao) throws JogoInexistenteException;
    Genero consultaGeneroDoJogo(String titulo) throws JogoInexistenteException;
    void alteraPrecoDoJogo(int preco, int novoPreco);
    void removeJogo(String titulo) throws JogoInexistenteException;
}
