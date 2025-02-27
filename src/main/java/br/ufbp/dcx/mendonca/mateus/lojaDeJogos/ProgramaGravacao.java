package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static br.ufbp.dcx.mendonca.mateus.lojaDeJogos.Genero.*;

public class ProgramaGravacao {
    public static void main(String [] args) {

        Jogo j1 = new Jogo("COD: BO1",
                "Call of Duty: Black Ops é um jogo eletrônico de " +
                        "tiro em primeira pessoa desenvolvido pela Treyarch.", "001", TIRO, 50, 999);
        Jogo j2 = new Jogo("TLOU", "The Last of Us é um jogo eletrônico de ação-aventura " +
                "e sobrevivência desenvolvido pela Naughty Dog" +
                " e publicado pela Sony Computer Entertainment.", "002", ACAO_AVENTURA, 120, 999);

        List<Jogo> jogos = new ArrayList<>();
        jogos.add(j1);
        jogos.add(j2);

        GravadorDeJogos gravadorDeJogos = new GravadorDeJogos();
        try {
            gravadorDeJogos.gravaJogos(jogos);
            System.out.println("Jogos salvos com sucesso. ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Recuperando jogos...");
        try {
            Collection<Jogo> jogosAchados = gravadorDeJogos.recuperarJogos();
            System.out.println("Jogos achados:");
            for (Jogo j: jogosAchados) {
                System.out.println(j.toString());
            }
        } catch (IOException e) {
            e.getStackTrace();
        }



    }
}
