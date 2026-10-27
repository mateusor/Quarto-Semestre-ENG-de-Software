public class Vetor2D{

    private double x;
    private double y;

    public Vetor2D (double x, double y){

        this.x;
        this.y;
    }

    public Vetor2D somar (Vetor2D outro) throws Exception{

        if (outro == null){

            throw new Exception ("Vetor invalido");
        } 

        double x = this.x + outro.x;
        double y = this.y + outro.y;

        return new Vetor2D(x,y);
    }

    public Vetor2D subtrair (Vetor2D outro) throws Exception{

        if (outro == null){

            throw new Exception ("Vetor invalido");
        }

        double x = this.x - outro.x;
        double y = this.y - outro.y;

        return new Vetor2D(x,y);
    }

    public Vetor2D multiplicarPor(double k){

        double x = k * this.x;
        double y = k * this.y;

        return new Vetor2D(x,y);
    }

    public Vetor2D produtoEscalar (Vetor2D outro) throws Exception{

        double p = ((this.x * outro.x) + (this.y * outro.y));

        return new Vetor2D(x,y);
    }

    @Override

    public String toString(){

        return "Vetor:" + this.x + "," + this.y;
    }

    @Override 

    public boolean equals(Object obj){

        if (this == obj){
            
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){
            
            return false;
        }

        Vetor2D outro = (Vetor2D) obj;

        return this.x == outro.x && this.y == outro.y;
        
    }

    public int hashCode(){

        int resultado = 1;

        resultado = 2 * resultado + Double.hashCode(this.x);
        resultado = 2 * resultado + Double.hashCode(this.y);

        if (resultado < 0){

            resultado = -resultado;
        }

        return resultado;
}
}