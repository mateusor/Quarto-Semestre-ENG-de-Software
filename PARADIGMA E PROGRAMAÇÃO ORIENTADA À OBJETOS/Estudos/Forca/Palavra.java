public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        if (texto == null)
        {
            throw new Exception("Texto nao pode ser nulo");
        }

        if (texto.length() == 0)
        {
            throw new Exception("Texto nao pode ser vazio");
        }

        this.texto = texto;
    }

    public int getQuantidade (char letra)
    {
        int quantidade = 0;

        for (int i = 0; i < this.texto.length(); i++)
        {
            if (this.texto.charAt(i) == letra)
            {
                quantidade = quantidade + 1;
            }
        }

        return quantidade;
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        int contador = 0;

        for (int posicao = 0; posicao < this.texto.length(); posicao++)
        {
            if (this.texto.charAt(posicao) == letra)
            {
                if (contador == i)
                {
                    return posicao;
                }

                contador = contador + 1;
            }
        }

        throw new Exception("Nao existe a " + i + "-esima ocorrencia da letra " + letra);
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    @Override
    public String toString ()
    {
        return this.texto;
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

        Palavra outra = (Palavra) obj;

        if (this.texto.equals(outra.texto))
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode ()
    {
        int resultado = 1;

        for (int i = 0; i < this.texto.length(); i++)
        {
            resultado = 2 * resultado + this.texto.charAt(i);
        }

        return resultado;
    }

    @Override
    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}