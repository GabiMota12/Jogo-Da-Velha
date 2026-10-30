package Jogo_Da_Velha;

import Jogo_Da_Velha.Jogador.*;
import Jogo_Da_Velha.Jogo.AnalistaSituacional;
import Jogo_Da_Velha.Jogo.Marca;
import Jogo_Da_Velha.Jogo.Tabuleiro;

public class Velha
{
    public static void main (String args []) throws Exception
    {
        Tabuleiro           tabDoJogo;

        Jogador             jogador  = null;
        JogadorHumano       jogadorH = null;
        JogadorAutomatico   jogadorA = null;

        AnalistaSituacional analista;

        boolean jogadorHumanoComeca = (int)(Math.random()*2) == 0;
        boolean jogarNovamente = true;

        do
        {
            tabDoJogo = new Tabuleiro ();

            if (jogadorHumanoComeca)
            {
                jogadorH = new JogadorHumano (tabDoJogo);
                jogadorA = new JogadorAutomatico
                          (tabDoJogo,
                           new Marca(jogadorH.getMarca().getSimbolo()=='X'?'O':'X'));
            }
            else
            {
                jogadorA = new JogadorAutomatico (tabDoJogo);
                jogadorH = new JogadorHumano
                          (tabDoJogo,
                           new Marca(jogadorA.getMarca().getSimbolo()=='X'?'O':'X'));
            }

            analista = new AnalistaSituacional (tabDoJogo);

            if (jogadorHumanoComeca)
                jogador=jogadorH;
            else
                jogador=jogadorA;

            do
            {
                boolean jogadaValida = false;
                while (!jogadaValida)
                {
                    try
                    {
                        jogador.facaSuaJogada();
                        jogadaValida = true;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Jogada inválida: " + e.getMessage());
                    }
                }

                if (jogador==jogadorH)
                    jogador=jogadorA;
                else
                    jogador=jogadorH;
            }
            while (!analista.fimDeJogo());

            Marca vencedor = analista.getMarcaDoVencedor();
            if (vencedor == null)
                jogadorH.deuVelha ();
            else if (vencedor.equals(jogadorH.getMarca()))
                jogadorH.vcGanhou ();
            else if (vencedor.equals(jogadorA.getMarca()))
                jogadorH.vcPerdeu ();

            jogadorHumanoComeca = !jogadorHumanoComeca;

            while (true)
            {
                try
                {
                    jogarNovamente = jogadorH.querMaisUmaPartida();
                    break;
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        while (jogarNovamente);
    }
}