public class Circulo{

    private double xc, yc, raio;

    public Circulo (double xc, double yc, double raio) throws Exception{

        this.setCentro(xc, yc);
        this.setRaio(raio);
    }

    public void setCentro (double xc, double yc){

        this.xc = xc;
        this.yc = yc;
    }

    public void setRaio (double raio) throws Exception{

        if (raio <= 0){
            throw new Exception ("Raio invalido");
        }

        this.raio = raio;
    }

    public double getComprimentoArco (double theta){

        return this.raio * theta;
    }

    public double getAreaSetor (double theta){
        
        return ((this.raio * this.raio) * theta) /2;
    
    }

    @Override 

    public String toString() {

        return "Circulo[Centro: (" + this.xc + "," + this.yc + ")Raio" + this.raio +"]";
    }
    
    @Override

    public boolean equals(Object obj){

        if (this == obj){

            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        Circulo outro = (Circulo) obj;

        if (this.xc == outro.xc && this.yc == outro.yc && this.raio == outro.raio){

            return true;

        }

        return false;
    }

    @Override 

    public int hashCode(){

        int resultado = 1;

        resultado = 2 * resultado + ((Double) this.xc).hashCode();
        resultado = 2 * resultado + ((Double) this.yc).hashCode();
        resultado = 2 * resultado + ((Double) this.raio).hashCode();

        if(resultado < 0){
            
            resultado = -resultado;
        }

        return resultado;
    }

    public Circulo (Circulo modelo) throws Exception{

        if (modelo == null){
            throw new Exception ("Modelo ausente");
        }
        this.xc = modelo.xc;
        this.yc = modelo.yc;
        this.raio = modelo.raio;
    }

    @Override

    public Object clone(){

        Circulo retorno = null;

        try{
            retorno = new Circulo(this);
        }

        catch(Exception e){}

        return retorno;
    }


}