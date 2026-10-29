public class Velocimetro implements Comparable <Velocimetro>
{
    private double velocidadeAtual; // em km/h

    public Velocimetro(double velocidadeAtual) throws Exception
    {
        this.setVelocidade(velocidadeAtual);
    }

    public void setVelocidade(double velocidade) throws Exception
    {
        if (velocidade < 0) throw new Exception("Velocidade nao pode ser negativa");
        this.velocidadeAtual = velocidade;
    }

    public double getVelocidade()
    {
        return this.velocidadeAtual;
    }

    // Um Velocimetro (v1) é considerado mais rápido que outro (v2)
    // se sua velocidade atual for maior.

    // ---------------------------------------------------------------
    // Daqui pra baixo é com você.
    // ---------------------------------------------------------------

    @Override
    public String toString() {

        return "Velocimetro:  " + this.velocidadeAtual + "km";
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){

            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        Velocimetro outro = (Velocimetro) obj;

        if (this.velocidadeAtual == outro.velocidadeAtual){

            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {

        int resultado = 1;

        resultado = 2 * resultado + ((Double) this.velocidadeAtual).hashCode();

        if(resultado < 0){

            resultado = - resultado;
        }

        return resultado;
    }

    @Override
    public int compareTo (Velocimetro outro){

        if(this.velocidadeAtual > outro.velocidadeAtual){

            return 1;
        }

        if(this.velocidadeAtual < outro.velocidadeAtual){

            return -1;
        }

        return 0;
    }

    public Velocimetro (Velocimetro modelo)throws Exception{

        if (modelo == null){
            
            throw new Exception("Modelo ausente");
        }
        this.velocidadeAtual = modelo.velocidadeAtual;
    }

    @Override 

    public Object clone(){

        Velocimetro retorno = null;

        try {
            
            retorno = new Velocimetro (this);

        } catch (Exception e) {
        }

        return  retorno;
    }
}