public class Retangulo implements Comparable<Retangulo>, Cloneable{

    private double b;
    private double h;

    public Retangulo(double b, double h)throws Exception{

        if (b <= 0 || h <= 0){
            throw new Exception("Base e altura devem ser positivos");
        }

        this.b = b;
        this.h = h;
    }

    public double getPerimetro() {

        return  2 * (this.b + this.h);
    }

    public double getArea() {

        return (this.b * this.h);
    }

    public Retangulo aumentarEm (double k) throws Exception{

        if (k <= 0){
            throw new Exception ("k tem que ser positvo");
        }

        

        return Retangulo(this.b * k, this.h * k);

    }

    @Override

    public String toString(){

        return "Retangulo: [base: " + this.b + "altura: " + this.h +"]";
    }

    @Override

    public boolean equals(Object obj){

        if (this == obj){
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Retangulo outro = (Retangulo)obj;

        if (this.b == outro.b && this.h == outro.h){
            return true
        }
        
        return false;
    }

    @Override

    public int hashCode(){

        int resultado = 1;

        resultado = 2 * resultado + ((Double) this.b).hashcode();
        resultado = 2 * resultado + ((Double) this.h).hashcode();

        if (resultado < 0){

            resultado = - resultado;
        }

        return resultado;
    }

    @Override 

    public int compareTo(Retangulo outro){

        double areaThis = getArea(this);
        double areaOutro = getArea(outro);

        if (areaThis > areaOutro){
            
            return -1;
        }

        if (areaThis < areaOutro){
            return 1;
        }
        return 0;
    }

    

}