public class Bateria implements Comparable<Bateria>, Cloneable
{
    private int carga;

    public Bateria (int carga) throws Exception
    {
        if (carga < 0 || carga > 100) throw new Exception("Carga invalida");
        this.carga = carga;
    }

    public void carregar (int quantidade) throws Exception
    {
        if (quantidade <= 0) throw new Exception("Quantidade invalida");

        this.carga = this.carga + quantidade;
        if (this.carga > 100) this.carga = 100;
    }

    public void descarregar (int quantidade) throws Exception
    {
        if (quantidade <= 0) throw new Exception("Quantidade invalida");
        if (this.carga - quantidade < 0) throw new Exception("Carga insuficiente");

        this.carga = this.carga - quantidade;
    }

    public int getCarga ()
    {
        return this.carga;
    }

    // ---------------------------------------------------------------
    // Daqui pra baixo é com você — decide quais fazem sentido e
    // implementa. Pense: essa classe é mutável? Existe ordem natural?
    // ---------------------------------------------------------------

    @Override

    public String toString ()
    {
        return "Bateria: "+ this.carga + "%";
    }


    @Override

    public boolean equals(Object obj)

    {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Bateria outro = (Bateria) obj;

        if (this.carga == outro.carga) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode()

    {
        int resultado = 1;

        resultado = 2 * resultado + ((Integer) this.carga).hashCode();

        if (resultado < 0) {
            resultado = -resultado;
        }

        return resultado;
    }

    @Override

    public int compareTo (Bateria outro){

        if (this.getCarga() > outro.getCarga()){

            return 1;
        }

        if (this.getCarga() < outro.getCarga()){

            return -1;

        }

        return 0;

    }

    public Bateria (Bateria modelo) throws Exception{

        if(modelo == null){
            throw new Exception("Modelo ausente");
        }

        this.carga = modelo.carga;
    }


    @Override

    public Object clone(){

        Bateria retorno = null;

        try{
            retorno = new Bateria(this);
        }

        catch (Exception e){}

        return retorno;
    }
}