public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra)
    {
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++)
        {
            if (this.letrasJaDigitadas.charAt(i) == letra)
            {
                return true;
            }
        }

        return false;
    }

    public void registre (char letra) throws Exception
    {
        if (this.isJaDigitada(letra))
        {
            throw new Exception("Letra ja foi digitada");
        }

        this.letrasJaDigitadas = this.letrasJaDigitadas + letra;
    }

    @Override
    public String toString ()
    {
        String resultado = "";

        for (int i = 0; i < this.letrasJaDigitadas.length(); i++)
        {
            if (i == 0)
            {
                resultado = resultado + this.letrasJaDigitadas.charAt(i);
            }
            else
            {
                resultado = resultado + "," + this.letrasJaDigitadas.charAt(i);
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

        ControladorDeLetrasJaDigitadas outro = (ControladorDeLetrasJaDigitadas) obj;

        if (this.letrasJaDigitadas.equals(outro.letrasJaDigitadas))
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode ()
    {
        int resultado = 1;

        for (int i = 0; i < this.letrasJaDigitadas.length(); i++)
        {
            resultado = 2 * resultado + this.letrasJaDigitadas.charAt(i);
        }

        return resultado;
    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de cópia
    {
        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    @Override
    public Object clone ()
    {
        try
        {
            return new ControladorDeLetrasJaDigitadas(this);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}