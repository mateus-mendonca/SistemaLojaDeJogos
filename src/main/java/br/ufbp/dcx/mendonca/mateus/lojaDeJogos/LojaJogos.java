package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.IOException;
import java.util.Collection;

public interface LojaJogos {
    void cadastraJogo(String titulo, String descricao, String codigo, Genero genero, int preco, int quantidade) throws JogoJaExisteException;
    Collection<Jogo> pesquisaJogosPeloGenero(Genero genero) throws JogoInexistenteException;
    Collection<Jogo> pesquisaJogoPelaDescricao(String descricao) throws JogoInexistenteException;
    Genero consultaGeneroDoJogo(String codigo) throws JogoInexistenteException;
    int consultaQuantidadeEmEstoque(String codigo) throws JogoInexistenteException;
    void alteraPrecoDoJogo(String codigo, int novoPreco) throws JogoInexistenteException;
    void removeJogo(String codigo) throws JogoInexistenteException;
}
