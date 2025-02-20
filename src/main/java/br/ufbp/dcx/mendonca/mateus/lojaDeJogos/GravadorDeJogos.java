package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class GravadorDeJogos {

    private String arquivoJogos;

    public GravadorDeJogos() {
        this.arquivoJogos = "jogos.dat";
    }

    public Collection<Jogo> recuperarJogos() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.arquivoJogos))) {
            Collection<Jogo> jogosAchados = (ArrayList<Jogo>) in.readObject();
            return jogosAchados;
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException(e);
        }
    }

    public void gravaJogos(Collection<Jogo> jogos) throws IOException {
        ArrayList<Jogo> jogosArrayList = new ArrayList<>();
        jogosArrayList.addAll(jogos);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(this.arquivoJogos))) {
            out.writeObject(jogosArrayList);
        }
    }
}
