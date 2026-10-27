public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        if (qtd <= 0)
        {
            throw new Exception("qtd deve ser positiva");
        }

        this.texto = new char [qtd];

        for (int i = 0; i < this.texto.length; i++)
        {
            this.texto[i] = '_';
        }
    }

    public void revele (int posicao, char letra) throws Exception
    {
        if (posicao < 0 || posicao >= this.texto.length)
        {
            throw new Exception("Posicao invalida");
        }

        if (this.texto[posicao] != '_')
        {
            throw new Exception("Posicao ja foi revelada");
        }

        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos ()
    {
        for (int i = 0; i < this.texto.length; i++)
        {
            if (this.texto[i] == '_')
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString ()
    {
        String resultado = "";

        for (int i = 0; i < this.texto.length; i++)
        {
            if (i == 0)
            {
                resultado = resultado + this.texto[i];
            }
            else
            {
                resultado = resultado + " " + this.texto[i];
            }
        }

        return resultado;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null)
        {
            return false;
        }

        if (this.getClass() != obj.getClass())
        {
            return false;
        }

        Tracinhos outro = (Tracinhos) obj;

        if (this.texto.length != outro.texto.length)
        {
            return false;
        }

        for (int i = 0; i < this.texto.length; i++)
        {
            if (this.texto[i] != outro.texto[i])
            {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode ()
    {
        int resultado = 1;

        for (int i = 0; i < this.texto.length; i++)
        {
            resultado = 2 * resultado + this.texto[i];
        }

        return resultado;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        this.texto = new char [t.texto.length];

        for (int i = 0; i < t.texto.length; i++)
        {
            this.texto[i] = t.texto[i];
        }
    }

    @Override
    public Object clone ()
    {
        try
        {
            return new Tracinhos(this);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}