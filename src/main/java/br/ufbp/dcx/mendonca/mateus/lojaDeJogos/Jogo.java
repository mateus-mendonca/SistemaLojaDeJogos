package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.Serializable;
import java.util.Objects;

public class Jogo implements Serializable {
    private String titulo;
    private String descricao;
    private String codigo;
    private Genero genero;
    private int preco;
    private int quantidade;


    public Jogo(String titulo, String descricao, String codigo, Genero genero, int preco, int quantidade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.codigo = codigo;
        this.genero = genero;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }
    public Genero getGenero() {
        return genero;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setQantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", genero=" + genero +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return preco == jogo.preco && quantidade == jogo.quantidade && Objects.equals(titulo, jogo.titulo) && Objects.equals(descricao, jogo.descricao) && genero == jogo.genero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, genero, preco, quantidade);
    }
}
