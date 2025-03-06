package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
        Jogo j3 = new Jogo("GTA V", "Grand Theft Auto V é um jogo eletrônico de ação-aventura " +
                "desenvolvido pela Rockstar North e publicado pela Rockstar Games", "003", ACAO_AVENTURA,
                100, 999);
        List<Jogo> jogos = new ArrayList<>();
        jogos.add(j1);
        jogos.add(j2);
        jogos.add(j3);

        SistemaLojaJogos sistema = new SistemaLojaJogos();

        try {
            sistema.cadastraJogo("GOW", "God of War é um jogo eletrônico de ação-aventura e hack and slash desenvolvido pela Santa Monica Studio e publicado pela Sony Computer Entertainment (SCE).",
                    "004", ACAO_AVENTURA, 70, 999);
            System.out.println("Jogo cadastrado com sucesso!");
        } catch (JogoJaExisteException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Jogos encontrados: " + sistema.pesquisaJogosPeloGenero(ACAO_AVENTURA));
        } catch (JogoInexistenteException e) {
            System.out.println(e.getMessage());
        }

        try {
            sistema.removeJogo("004");
            System.out.println("Jogo removido com sucesso!");
        } catch (JogoInexistenteException e) {
            System.out.println(e.getMessage());
        }

//        GravadorDeJogos gravadorDeJogos = new GravadorDeJogos();
//
//        System.out.println("Recuperando jogos...");
//        try {
//            Collection<Jogo> jogosAchados = gravadorDeJogos.recuperarJogos();
//            System.out.println("Jogos achados:");
//            for (Jogo j: jogosAchados) {
//                System.out.println(j.toString());
//            }
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//
//        try {
//            gravadorDeJogos.gravaJogos(jogos);
//            System.out.println("Jogos salvos com sucesso. ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
