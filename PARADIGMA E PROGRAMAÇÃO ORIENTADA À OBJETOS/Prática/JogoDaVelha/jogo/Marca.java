package jogo;


public class Marca
{
    private char simbolo;

    public Marca (char smb) throws Exception
    {
        // validar smb, garantindo que ele
        // seja 'X' ou 'O' e coloca-lo em
        // simbolo
        // dar excecao em caso de valor invalido
        if (smb != 'X' && smb != 'O')
            throw new Exception ("Simbolo invalido");

        this.simbolo = smb;
    }

    public char getSimbolo ()
    {
        // retornar simbolo
        return this.simbolo;
    }

    @Override
    public String toString(){

        return "" + this.simbolo;
    }

    @Override

    public boolean equals(Object obj){

        if (this == obj){

            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        Marca outro = (Marca) obj;

        if (this.simbolo == outro.simbolo){

            return true;
        }

        return false;
    }

    @Override

    public int hashCode(){

        int resultado = 1;
        resultado = 2 * resultado + ((Character) this.simbolo).hashCode();

        if (resultado < 0){
            resultado = -resultado;
        }
        return resultado;
    }
}