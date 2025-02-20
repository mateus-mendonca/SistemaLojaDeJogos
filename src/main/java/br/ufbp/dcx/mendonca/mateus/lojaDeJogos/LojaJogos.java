package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.IOException;
import java.util.Collection;

public interface LojaJogos {
    boolean cadastraJogo(String titulo, String descricao, Genero genero, int preco, int quantidade) throws JogoJaExisteException;
    Collection<Jogo> pesquisaJogosPeloGenero(Genero genero);
    Collection<Jogo> pesquisaJogoPelaDescricao(String descricao);
    boolean removeJogo(String titulo) throws JogoInexistenteException;
    void salvarDados() throws IOException;
    void recuperarDados() throws IOException;
}
