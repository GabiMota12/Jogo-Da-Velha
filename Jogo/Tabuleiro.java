package Jogo_Da_Velha.Jogo;

public class Tabuleiro implements Cloneable
{
    // a principio, toda igual a null
    private Marca matriz [][] = new Marca [3][3];

    public Tabuleiro ()
    {
        this.matriz = new Marca [3][3];
    }

    public boolean haMarcaNaPosicao (int lin, int col) throws Exception
    {
        if (lin < 0 || lin >= 3 || col < 0 || col >= 3)
            throw new Exception ("Tabuleiro: posicao invalida");
        if (this.matriz[lin][col] == null)
            return false;
        else
            return true;

        // verifico se em matriz[lin][col]
        // tem null, retornando false em caso
        // afirmativo, ou true em caso negativo
        // dar excecao caso lin ou col invalido
    }

    public Marca getMarcaNaPosicao (int lin, int col) throws Exception
    {
        if (lin < 0 || lin >= 3 || col < 0 || col >= 3)
            throw new Exception ("Tabuleiro: posicao invalida");
        return this.matriz[lin][col];

        // retornar a marca que tem em
        // matriz[lin][col]
        // dar excecao caso lin ou col invalido
    }

    public void setMarcaNaPosicao (Marca mrc, int lin, int col) throws Exception
    {
        if (lin < 0 || lin >= 3 || col < 0 || col >= 3)
            throw new Exception ("Tabuleiro: posicao invalida");
        if (mrc == null)
            throw new Exception ("Tabuleiro: marca nula");
        this.matriz[lin][col] = mrc;

        // colocar mrc em matriz[lin][col],
        // dar excecao caso lin ou col invalido
        // dar excecao caso mrc seja null
    }

    @Override
    public String toString() {
        return " " + matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2] + "\n" +
            "---+---+---\n" +
            " " + matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2] + "\n" +
            "---+---+---\n" +
            " " + matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2];
        // retornar em um String o tabuleiro
        // formatado para ser exibido na tela
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Tabuleiro outro = (Tabuleiro) obj;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (this.matriz[i][j] == null && outro.matriz[i][j] != null)
                    return false;
                else if (this.matriz[i][j] != null && outro.matriz[i][j] == null)
                    return false;
                else if (this.matriz[i][j] != null && outro.matriz[i][j] != null &&
                         !this.matriz[i][j].equals(outro.matriz[i][j]))
                    return false;
            }
        }
        return true;

        // retornar true se this for igual a obj ou false caso contrario
    }

    @Override
    public int hashCode ()
    {
        int resultado = 1;  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Marca marca = this.matriz[i][j];
                resultado = 31 * resultado
                        + (marca == null ? 0 : marca.hashCode());
            }
        }
    return resultado;
    }
        
    // construtor de copia
    public Tabuleiro (Tabuleiro modelo) throws Exception
    {
        if (modelo == null)
            throw new Exception ("Tabuleiro: modelo nulo");
        else
            this.matriz = new Marca[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Marca marca = modelo.matriz[i][j];
                    if (marca != null) {
                        this.matriz[i][j] = new Marca(marca.getSimbolo());
                    }
                }
            }
    }

    @Override
    public Object clone ()
    {
        try {
            return new Tabuleiro(this);
        } catch (Exception e) {
            return null;
        }
    }
}