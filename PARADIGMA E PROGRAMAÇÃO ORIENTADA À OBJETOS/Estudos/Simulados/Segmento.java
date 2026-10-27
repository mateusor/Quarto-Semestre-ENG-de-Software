public class Segmento implements Compareable <Segmento>{

    private double x1, y1, x2, y2;

    public Segmento (double x1, double y1, double x2, double y2) throws Exception{

        if (x1 == x2 && y1 ==y2){

            return new Exception("Os pontos não podem ser os mesmo");
        }

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getComprimento ()
{
        double dx = this.x2 - this.x1;
        double dy = this.y2 - this.y1;

        return Math.sqrt(dx * dx + dy * dy);
}

    @Override

    public String toString(){

        return "Segmento X1:" + this.x1 + " Y1:" + this.y1 + ", X2:" + this.x2 + " Y2:" + this.y2;
    }

    @Override 

    public boolean equals(Object obj){

        if (this == obj){

            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        Segmento outro = (Segmento) obj;

        if (this.x1 == outro.x1 && this.y1 == outro.y1 && this.x2 == outro.x2 && this.y2 == outro.y2){

            return true;
        }

        return false;
    }

    @Override

    public int hashCode(){

        int resultado = 1;
        resultado = 2 * resultado + ((Double) this.x1).hashCode();
        resultado = 2 * resultado + ((Double) this.y1).hashCode();
        resultado = 2 * resultado + ((Double) this.x2).hashCode();
        resultado = 2 * resultado + ((Double) this.y2).hashCode();

        if (resultado < 0){
            resultado = -resultado;
        }
        return resultado;
    }

    @Override
    
    public int compareTo(Segmento outro){

        if (this.getComprimento() > outro.getComprimento()){
            
            return 1;
        }

        if (this.getComprimento() < outro.getComprimento()){

            return -1;
        }

        return 0;
    }