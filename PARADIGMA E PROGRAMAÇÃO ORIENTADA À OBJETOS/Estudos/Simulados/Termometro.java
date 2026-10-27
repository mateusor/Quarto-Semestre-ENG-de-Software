public class Termometro implements Comparable <Termometro>, Cloneable {

    private double temperatura;

    public Termometro(double temperatura) throws Exception{

        setTemperatura(temperatura);
    }

    public void setTemperatura (double temperatura) throws Exception{

        if (temperatura <  -273.15){

            throw new Exception ("Temperatura invalida");
        }

        this.temperatura = temperatura;
    }

    public double getTemperatura(){

        return this.temperatura;
    }

    public void aumentarEm (double delta) throws Exception{

        this.setTemperatura(this.temperatura + delta);
    }

    @Override

    public String toString (){

        return "Termometro:  " + this.temperatura + "C";
    }
    
    @Override 

    public boolean equals (Object obj){

        if (this == obj){

            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        Termometro outro = (Termometro) obj;

        if (this.temperatura == outro.temperatura){

            return true;
        }

        return false;
    }

    @Override

    public int hashCode(){

        int resultado = 1;

        resultado = 2 * resultado + ((Double) this.temperatura).hashCode();

        if(resultado < 0){

            resultado = -resultado;
        }

        return resultado;
    }

    @Override

    public int compareTo (Termometro outro){

        if (this.temperatura > outro.temperatura){

            return 1;
        }

        if (this.temperatura < outro.temperatura){

            return -1;
        }

        return 0;
    }

    public Termometro (Termometro modelo) throws Exception {

        if (modelo == null){
            
            throw new Exception("Modelo ausente");
        }

        this.temperatura = modelo.temperatura;
    }

    @Override

    public Object clone(){

        Termometro retorno = null;

        try {

            returno = new Termometro(this);
        }

        catch (Exception e){}

        return retorno;

    }


}