package br.ufbp.dcx.mendonca.mateus.lojaDeJogos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static br.ufbp.dcx.mendonca.mateus.lojaDeJogos.Genero.*;

public class ProgramaGravacao {
    public static void main(String [] args) {
        List<Jogo> jogos = new ArrayList<>();
        /*Jogo j1 = new Jogo("Call of Duty: Black Ops",
                "Call of Duty: Black Ops é um jogo eletrônico de " +
                        "tiro em primeira pessoa desenvolvido pela Treyarch.", TIRO, 50, 999);
        Jogo j2 = new Jogo("The Last of Us", "The Last of Us é um jogo eletrônico de ação-aventura " +
                "e sobrevivência desenvolvido pela Naughty Dog" +
                " e publicado pela Sony Computer Entertainment.", ACAO_AVENTURA, 120, 999);


        jogos.add(j1);
        jogos.add(j2);*/
        //List<Jogo> jogos = new ArrayList<>();
        GravadorDeJogos gravadorDeJogos = new GravadorDeJogos();
        System.out.println("Recuperando jogos...");
        try {
            gravadorDeJogos.recuperarJogos();
            System.out.println("Jogos achados:");
            for (Jogo j: jogos) {
                System.out.println(j.toString());
            }
        } catch (IOException e) {
            e.getStackTrace();
        }



        /*try {
            gravadorDeJogos.gravaJogos(jogos);
            System.out.println("Jogos salvos com sucesso. ");
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }
}
