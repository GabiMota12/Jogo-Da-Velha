package Jogo_Da_Velha.Jogo;

public class AnalistaSituacional
{
    private Tabuleiro tabDoJogo;

    public AnalistaSituacional (Tabuleiro tab) throws Exception
    {
        if (tab == null)
            throw new Exception ("AnalistaSituacional: tabuleiro nulo");
        else
            this.tabDoJogo = tab;
    }

    public Marca getMarcaDoVencedor () throws Exception
    {
        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            Marca marca = tabDoJogo.getMarcaNaPosicao(i, 0);
            if (marca != null &&
                marca.equals(tabDoJogo.getMarcaNaPosicao(i, 1)) &&
                marca.equals(tabDoJogo.getMarcaNaPosicao(i, 2)))
                return marca;

            marca = tabDoJogo.getMarcaNaPosicao(0, i);
            if (marca != null &&
                marca.equals(tabDoJogo.getMarcaNaPosicao(1, i)) &&
                marca.equals(tabDoJogo.getMarcaNaPosicao(2, i)))
                return marca;
        }

        // Verifica a diagonal principal
        Marca marca = tabDoJogo.getMarcaNaPosicao(0, 0);
        if (marca != null &&
            marca.equals(tabDoJogo.getMarcaNaPosicao(1, 1)) &&
            marca.equals(tabDoJogo.getMarcaNaPosicao(2, 2)))
            return marca;

        // Verifica a diagonal secundária
        marca = tabDoJogo.getMarcaNaPosicao(0, 2);
        if (marca != null &&
            marca.equals(tabDoJogo.getMarcaNaPosicao(1, 1)) &&
            marca.equals(tabDoJogo.getMarcaNaPosicao(2, 0)))
            return marca;

        return null;
        
        // descobrir se ha um vencedor e retornar
        // a marca dele; retornara null, quando
        // nao houver vencedor
    }

    private boolean tabuleiroCheio() throws Exception
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!tabDoJogo.haMarcaNaPosicao(i, j)) {
                    return false;
                }
            }
        }
        // verificar se todas as posicoes do
        // tabuleiro estao preenchidas (!=null)
        // retornando true em caso afirmativo,
        // ou false em caso negativo
        return true;
    }

    public boolean fimDeJogo () throws Exception
    {
        if (getMarcaDoVencedor() != null)
            return true;
        if (tabuleiroCheio())
            return true;
        return false;

        // se getMarcaDoVencedor != null,
        // retorna true
        // se tabuleiroCheio == true,
        // retorna true
        // caso contrario, retorna false
    }

    @Override
    public String toString() {
        try {
            return tabDoJogo.toString()
                    + " - Vencedor: "
                    + getMarcaDoVencedor();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        AnalistaSituacional outro = (AnalistaSituacional) obj;
        return this.tabDoJogo.equals(outro.tabDoJogo);

        // retornar true se this for igual a obj ou false caso contrario
    }

    @Override
    public int hashCode ()
    {
        return this.tabDoJogo.hashCode();
    }
}