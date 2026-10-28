package jogo;

public class AnalistaSituacional
{
    private Tabuleiro tabDoJogo;

    public AnalistaSituacional (Tabuleiro tab) throws Exception
    {
        // colocar tab em tabDoJogo
        this.tabDoJogo = tab;
    }

    public Marca getMarcaDoVencedor ()
    {
        // descobrir se ha um vencedor e retornar
        // a marca dele; retornara null, quando
        // nao houver vencedor
        try
        {
            // verificando as linhas
            for (int lin=0; lin<3; lin++)
                if (this.tabDoJogo.haMarcaNaPosicao(lin,0) &&
                    this.tabDoJogo.getMarcaNaPosicao(lin,0).equals(this.tabDoJogo.getMarcaNaPosicao(lin,1)) &&
                    this.tabDoJogo.getMarcaNaPosicao(lin,0).equals(this.tabDoJogo.getMarcaNaPosicao(lin,2)))
                    return this.tabDoJogo.getMarcaNaPosicao(lin,0);

            // verificando as colunas
            for (int col=0; col<3; col++)
                if (this.tabDoJogo.haMarcaNaPosicao(0,col) &&
                    this.tabDoJogo.getMarcaNaPosicao(0,col).equals(this.tabDoJogo.getMarcaNaPosicao(1,col)) &&
                    this.tabDoJogo.getMarcaNaPosicao(0,col).equals(this.tabDoJogo.getMarcaNaPosicao(2,col)))
                    return this.tabDoJogo.getMarcaNaPosicao(0,col);

            // verificando a diagonal principal
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) &&
                this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.tabDoJogo.getMarcaNaPosicao(2,2)))
                return this.tabDoJogo.getMarcaNaPosicao(0,0);

            // verificando a diagonal secundaria
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.tabDoJogo.getMarcaNaPosicao(1,1)) &&
                this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.tabDoJogo.getMarcaNaPosicao(2,0)))
                return this.tabDoJogo.getMarcaNaPosicao(0,2);
        }
        catch (Exception erro)
        {} // ignorando pois sei que nao estou usando posicao invalida nem comparando com equals um null

        return null;
    }

    private boolean tabuleiroCheio ()
    {
        // verificar se todas as posicoes do
        // tabuleiro estao preenchidas (!=null)
        // retornando true em caso afirmativo,
        // ou false em caso negativo
        try
        {
            for (int lin=0; lin<3; lin++)
                for (int col=0; col<3; col++)
                    if (!this.tabDoJogo.haMarcaNaPosicao(lin,col))
                        return false;
        }
        catch (Exception erro)
        {} // ignorando pois sei que nao estou usando posicao invalida

        return true;
    }

    public boolean fimDeJogo ()
    {
        // se getMarcaDoVencedor != null,
        // retorna true
        // se tabuleiroCheio == true,
        // retorna true
        // caso contrario, retorna false
        if (this.getMarcaDoVencedor() != null)
            return true;

        if (this.tabuleiroCheio())
            return true;

        return false;
    }

    @Override
    public String toString(){

        return "Analista do tabuleiro:\n" + this.tabDoJogo;
    }

    @Override

    public boolean equals(Object obj){

        if (this == obj){

            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        AnalistaSituacional outro = (AnalistaSituacional) obj;

        if (this.tabDoJogo.equals(outro.tabDoJogo)){

            return true;
        }

        return false;
    }

    @Override

    public int hashCode(){

        int resultado = 1;
        resultado = 2 * resultado + this.tabDoJogo.hashCode();

        if (resultado < 0){
            resultado = -resultado;
        }
        return resultado;
    }
}