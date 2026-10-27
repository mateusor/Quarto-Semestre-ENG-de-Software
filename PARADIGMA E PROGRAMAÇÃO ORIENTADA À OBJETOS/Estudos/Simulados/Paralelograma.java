public class Paralelograma implements Comparable<Paralelograma>
{
    private double b, h, ladoInclinado;

    public Paralelograma(double b, double h, double ladoInclinado) throws Exception
    {
        if (b <= 0 || h <= 0 || ladoInclinado <= 0) {
            throw new Exception("Os atributos devem ser positivos");
        }

        this.b = b;
        this.h = h;
        this.ladoInclinado = ladoInclinado;
    }

    public double getPerimetro()
    {
        return 2 * (this.b + this.ladoInclinado);
    }

    public double getArea()
    {
        return this.b * this.h;
    }

    public Paralelograma aumentarEscala(double k) throws Exception
    {
        return new Paralelograma(this.b * k, this.h * k, this.ladoInclinado * k);
    }

    @Override
    public String toString()
    {
        return "Paralelograma: [Base: " + this.b + "  Altura: " + this.h + "  ladoInclinado: " + this.ladoInclinado + "]";
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

        Paralelograma outro = (Paralelograma) obj;

        if (this.b == outro.b && this.h == outro.h && this.ladoInclinado == outro.ladoInclinado) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int resultado = 1;

        resultado = 2 * resultado + ((Double) this.b).hashCode();
        resultado = 2 * resultado + ((Double) this.h).hashCode();
        resultado = 2 * resultado + ((Double) this.ladoInclinado).hashCode();

        if (resultado < 0) {
            resultado = -resultado;
        }

        return resultado;
    }

    @Override
    public int compareTo(Paralelograma outro)
    {
        if (this.getArea() > outro.getArea()) {
            return 1;
        }

        if (this.getArea() < outro.getArea()) {
            return -1;
        }

        return 0;
    }


}