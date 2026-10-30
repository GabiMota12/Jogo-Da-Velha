package Jogo_Da_Velha.Jogo;

public class Marca
{
    private char simbolo;

    public Marca (char smb) throws Exception
    {
        if (smb != 'X' && smb != 'O')
            throw new Exception ("Marca: simbolo invalido");
        else
            this.simbolo = smb;
        // validar smb, garantindo que ele
        // seja 'X' ou 'O' e coloca-lo em
        // simbolo
        // dar excecao em caso de valor invalido
    }

    public char getSimbolo ()
    {
        // retornar simbolo
        return this.simbolo;
    }

    @Override
    public String toString ()
    {
        return ""+simbolo;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Marca marca = (Marca) obj;
        return simbolo == marca.simbolo;
        
        // retornar true se this for igual a obj ou false caso contrario
    }

    @Override
    public int hashCode ()
    {
        return Character.hashCode(this.simbolo);
    }
}