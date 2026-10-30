package Jogo_Da_Velha.Jogador;

import java.io.*;
import Jogo_Da_Velha.Jogo.Marca;
import Jogo_Da_Velha.Jogo.Tabuleiro;

public class JogadorHumano implements Jogador
{
    private Marca          marca     = null;
    private Tabuleiro      tabDoJogo = null;
    private BufferedReader teclado   = new BufferedReader
                                        (new InputStreamReader
                                        (System.in));

    public JogadorHumano (Tabuleiro tab) throws Exception
    {
        tabDoJogo = tab;

        // atribuir tab para tabDoJogo

        System.out.print("Escolha sua marca (X ou O): ");
        String escolha = teclado.readLine().trim().toUpperCase();

        if (escolha.equals("X"))
            marca = new Marca('X');
        else if (escolha.equals("O"))
            marca = new Marca('O');
        else
            throw new Exception("Marca inválida");

        // pedir para o jogador escolher
        // sua marca e permitir digitacao
        // intanciando marca
    }

    public JogadorHumano (Tabuleiro tab, Marca mrc) throws Exception
    {
        tabDoJogo = tab;
        marca = mrc;

        // atribuir tab para tabDoJogo
        // e mrc para marca
    }

    public Marca getMarca ()
    {
        return this.marca;

        // retorna a marca do jogador
    }

    public void facaSuaJogada() throws Exception {
        System.out.println("Sua vez de jogar, " + this.marca.getSimbolo() + "!");
        System.out.println(tabDoJogo);

        System.out.print("Digite a linha (0, 1 ou 2): ");
        int linha;
        try {
            linha = Integer.parseInt(teclado.readLine().trim());
        } catch (NumberFormatException e) {
            throw new Exception("Linha inválida");
        }

        if (linha < 0 || linha > 2)
            throw new Exception("Linha inválida");

        System.out.print("Digite a coluna (0, 1 ou 2): ");
        int coluna;
        try {
            coluna = Integer.parseInt(teclado.readLine().trim());
        } catch (NumberFormatException e) {
            throw new Exception("Coluna inválida");
        }

        if (coluna < 0 || coluna > 2)
            throw new Exception("Coluna inválida");

        if (tabDoJogo.haMarcaNaPosicao(linha, coluna))
            throw new Exception("Essa posição já está ocupada");

        tabDoJogo.setMarcaNaPosicao(this.marca, linha, coluna);

        // pergunta para o jogador onde ele quer
        // jogar, permitindo digitacao e chamando
        // os métodos apropriados de tabDoJogo
    }

    public void vcGanhou(){
        
        System.out.println("Parabéns! Você ganhou!");
        // mostra mensagem indicando vitoria
    }

    public void vcPerdeu ()
    {
        System.out.println("Você perdeu!");
        // mostra mensagem indicando derrota
    }

    public void deuVelha ()
    {
        System.out.println("Deu velha! Empate!");
        // mostra mensagem indicando empate
    }

    public boolean querMaisUmaPartida () throws Exception
    {
        System.out.print("Deseja jogar mais uma partida? (s/n): ");
        String resposta = teclado.readLine().trim().toLowerCase();
        if (!resposta.equals("s") && !resposta.equals("n")) {
            throw new Exception("Resposta inválida");
        }
        if(resposta.equals("s")) {
            return true;
        } else {
            return false;
        }
        
        // perguntar se deseja jogar de novo
        // permitindo digitacao e retornando
        // true ou false, conforme a resposta
    }
}
