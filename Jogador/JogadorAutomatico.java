package Jogo_Da_Velha.Jogador;

import Jogo_Da_Velha.Jogo.Marca;
import Jogo_Da_Velha.Jogo.Tabuleiro;

public class JogadorAutomatico implements Jogador
{
    private Marca     marca     = null;
    private Tabuleiro tabDoJogo = null;

    public JogadorAutomatico (Tabuleiro tab) throws Exception
    {   
        tabDoJogo = tab;

        // atribuir tab para tabDoJogo

        if ((int)(Math.random()*2) == 0)
            marca=new Marca('X');
        else
            marca=new Marca('O');

        // fazer o jogador escolher sua marca
        // via sorteio de numeros aleatorio
    }

    public JogadorAutomatico (Tabuleiro tab, Marca mrc) throws Exception
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

    public void facaSuaJogada ()
    {
        try
        {
            // tentando ganhar na linha 0
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);

            // tentando ganhar na linha 1
            else
                 if (!this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
                else
                if ( this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                else
                if ( this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,2))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);

            else
            // tentando ganhar na linha 2
                 if (!this.tabDoJogo.haMarcaNaPosicao(2,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
                else
                if ( this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,1) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
                else
                if ( this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,2))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);

            else
            // tentando ganhar na coluna 0
                if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,0))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);

            else
            // tentando ganhar na coluna 1
                if (!this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,1))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);

            else
            // tentando ganhar na coluna 2
                if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,2) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,2))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);

            else
            // tentando ganhar na diagonal principal
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal secundaria
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando atrapalhar vitoria na linha 0
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando atrapalhar vitoria na linha 1
            if (!this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            // tentando atrapalhar vitoria na linha 2
            if (!this.tabDoJogo.haMarcaNaPosicao(2,0) &&
                this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na coluna 0
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando atrapalhar vitoria na coluna 1
            if (!this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando atrapalhar vitoria na coluna 2
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal principal
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal secundaria
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 0
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 1
            if (this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 2
            if (this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(2,0) &&
                this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.haMarcaNaPosicao(2,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 0
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 1
            if (this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 2
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.haMarcaNaPosicao(1,2) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal principal
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal secundaria
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            {
                boolean jogadaFeita = false;
                for (int linha = 0; linha < 3 && !jogadaFeita; linha++)
                {
                    for (int coluna = 0; coluna < 3 && !jogadaFeita; coluna++)
                    {
                        if (!this.tabDoJogo.haMarcaNaPosicao(linha, coluna))
                        {
                            this.tabDoJogo.setMarcaNaPosicao(this.marca, linha, coluna);
                            jogadaFeita = true;
                        }
                    }
                }
            }
        }
        catch (Exception erro)
        {} // ignorando pois sei que n o estou usando posicao invalida nem comparando com equals um null
    }

    @Override
    public String toString ()
    { 
        return "Jogador automático (marca: " + this.marca + ")";

    }

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        JogadorAutomatico outro = (JogadorAutomatico) obj;

        if (this.marca == null)
            return outro.marca == null;

        return this.marca.equals(outro.marca);
    }

    @Override
    public int hashCode ()
    {
        return this.marca == null ? 0 : this.marca.hashCode();
    }

    // construtor de cópia
    public JogadorAutomatico (JogadorAutomatico modelo) throws Exception
    {
        if (modelo == null)
            throw new Exception ("Modelo ausente");

        this.marca = modelo.marca;
        this.tabDoJogo = modelo.tabDoJogo;
    }

    @Override
    public Object clone ()
    {
        JogadorAutomatico ret = null;

        try
        {
            ret = new JogadorAutomatico(this);
        }
        catch (Exception erro)
        {} // sei que não vai ocorrer
        return ret;
    }
}