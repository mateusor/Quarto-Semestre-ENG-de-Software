public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if(qtdMax <= 0){
            throw new Exception("Quantidade invalida!");
        }
        this.qtdMax = qtdMax;
        // verifica se qtdMax fornecida n�o � positiva, lan�ando
        // uma exce��o.
        // armazena qtdMax fornecida em this.qtdMax.
    }

    public void registreUmErro () throws Exception
    {
        if(qtdErr == qtdMax){
            throw new Exeception("Já atingiu o limite de erros");
        }

        this.qtdErr++;
        // verifica se this.qtdErr ja � igual a this.qtdMax,
        // lan�ando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        if(qtdErr == qtdMax){
            return true;
        }
        else{
            return false;
        }
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou ent�o false, caso contrario.
    }

    @Override
    public String toString ()
    {
        return this.qtdEr   r + " de " + this.qtdMax;
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de c�pia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    @Override
    public Object clone ()
    {
        // returnar uma c�pia de this
    }
}
