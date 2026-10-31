package jogo;

public class Tabuleiro implements Cloneable
{
    // a principio, toda igual a null
    private Marca matriz [][] = new Marca [3][3];

    // construtor padrao: necessario porque Velha.java faz new Tabuleiro ()
    public Tabuleiro ()
    {} // nada a fazer: a matriz ja foi criada acima, com tudo igual a null

    public boolean haMarcaNaPosicao (int lin, int col) throws Exception
    {
        // verifico se em matriz[lin][col]
        // tem null, retornando false em caso
        // afirmativo, ou true em caso negativo
        // dar excecao caso lin ou col invalido
        if (lin<0 || lin>2 || col<0 || col>2)
            throw new Exception ("Posicao invalida");

        if (this.matriz[lin][col]==null)
            return false;

        return true;
    }

    public Marca getMarcaNaPosicao (int lin, int col) throws Exception
    {
        // retornar a marca que tem em
        // matriz[lin][col]
        // dar excecao caso lin ou col invalido
        if (lin<0 || lin>2 || col<0 || col>2)
            throw new Exception ("Posicao invalida");

        return this.matriz[lin][col];
    }

    public void setMarcaNaPosicao (Marca mrc, int lin, int col) throws Exception
    {
        // colocar mrc em matriz[lin][col],
        // dar excecao caso lin ou col invalido
        // dar excecao caso mrc seja null
        if (lin<0 || lin>2 || col<0 || col>2)
            throw new Exception ("Posicao invalida");

        if (mrc==null)
            throw new Exception ("Marca ausente");

        this.matriz[lin][col] = mrc;
    }

    @Override
    public String toString ()
    {
        // retornar em um String o tabuleiro
        // formatado para ser exibido na tela
        String ret = "     0   1   2\n";

        for (int lin=0; lin<3; lin++)
        {
            ret = ret + "  " + lin + " ";

            for (int col=0; col<3; col++)
            {
                if (this.matriz[lin][col]==null)
                    ret = ret + "   ";
                else
                    ret = ret + " " + this.matriz[lin][col] + " ";

                if (col<2)
                    ret = ret + "|";
            }

            ret = ret + "\n";

            if (lin<2)
                ret = ret + "    ---+---+---\n";
        }

        return ret;
    }

    @Override

    public boolean equals(Object obj){

        if (this == obj){

            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        Tabuleiro outro = (Tabuleiro) obj;

        for (int lin=0; lin<3; lin++){

            for (int col=0; col<3; col++){

                if (this.matriz[lin][col] == null){

                    if (outro.matriz[lin][col] != null){

                        return false;
                    }
                }
                else{

                    if (!this.matriz[lin][col].equals(outro.matriz[lin][col])){

                        return false;
                    }
                }
            }
        }

        return true;
    }

    @Override

    public int hashCode(){

        int resultado = 1;

        for (int lin=0; lin<3; lin++){

            for (int col=0; col<3; col++){

                if (this.matriz[lin][col] == null){

                    resultado = 2 * resultado + 0;
                }
                else{

                    resultado = 2 * resultado + this.matriz[lin][col].hashCode();
                }
            }
        }

        if (resultado < 0){
            resultado = -resultado;
        }
        return resultado;
    }

    // construtor de copia
    public Tabuleiro (Tabuleiro modelo) throws Exception
    {
        // faça
        if (modelo==null)
            throw new Exception ("Modelo ausente");

        for (int lin=0; lin<3; lin++)
            for (int col=0; col<3; col++)
                this.matriz[lin][col] = modelo.matriz[lin][col];
    }

    @Override
    public Object clone ()
    {
        // faça
        Tabuleiro ret = null;

        try
        {
            ret = new Tabuleiro (this);
        }
        catch (Exception erro)
        {} // ignorando pois sei que this nao e null

        return ret;
    }
}