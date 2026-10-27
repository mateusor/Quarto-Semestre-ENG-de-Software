public class Polinomio
{
    private int a;
    private int b;
    private int c;

    public Polinomio(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Polinomio somar(Polinomio outro) throws Exception
    {
        if (outro == null) {
            throw new Exception("Polinomio nao pode ser nulo");
        }

        int a = this.a + outro.a;
        int b = this.b + outro.b;
        int c = this.c + outro.c;

        return new Polinomio(a, b, c);
    }

    public Polinomio subtrair(Polinomio outro) throws Exception
    {
        if (outro == null) {
            throw new Exception("Polinomio nao pode ser nulo");
        }

        int a = this.a - outro.a;
        int b = this.b - outro.b;
        int c = this.c - outro.c;

        return new Polinomio(a, b, c);
    }

    public double calcularEm(double x0)
    {
        return (this.a * (x0 * x0)) + (this.b * x0) + this.c;
    }

    @Override
    public String toString()
    {
        return "Polinomio: " + this.a + "x²" + this.b + "x" + this.c;
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

        Polinomio outro = (Polinomio) obj;

        if (this.a == outro.a && this.b == outro.b && this.c == outro.c) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int resultado = 1;

        resultado = 2 * resultado + ((Integer) this.a).hashCode();
        resultado = 2 * resultado + ((Integer) this.b).hashCode();
        resultado = 2 * resultado + ((Integer) this.c).hashCode();

        if (resultado < 0){

            resultado = -resultado;
        }
        return resultado;
    }
}