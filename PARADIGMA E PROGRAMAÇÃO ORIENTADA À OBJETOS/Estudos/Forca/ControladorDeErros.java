public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if (qtdMax <= 0){
            throw new Exception("qtdMax deve ser positiva");
        }
        this.qtdMax = qtdMax;
        
    }

    public void registreUmErro () throws Exception
    {
        if (this.qtdErr == this.qtdMax){
            
            throw new Exception ("qtdErr não pode ser igual qtdMax");
        }
        
        this.qtdErr++;
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        if (this.qtdErr == this.qtdMax){
            return true;
        }

        return false;
       
    }

    @Override
    public String toString ()
    {
        return this.qtdErr + " de " + this.qtdMax;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj){
            
            return true;
        }

        if (obj == null){

            return false;
        }

        if(this.getClass() != obj.getClass()){

            return false;
        }

        ControladorDeErros outro = (ControladorDeErros) obj;

        if (this.qtdMax == outro.qtdMax && this.qtdErr == outro.qtdErr){

            return true;
        }

        return false;
 
    }
e
    @Override
    public int hashCode ()
    {
        int resultado = 1;
        resultado = 2 * resultado + this.qtdMax;
        resultado = 2 * resultado + this.qtdErr;
        return resultado;
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de c�pia
    {
        this.qtdMax = c.qtdMax;
        this.qtdErr = c.qtdErr;
    }

    @Override
    public Object clone ()
    {
       try{

        return new ContraladorDeErros(this);

       }

       catch (Exception e){

        throw new RuntimeException(e);

       }
    }
}
