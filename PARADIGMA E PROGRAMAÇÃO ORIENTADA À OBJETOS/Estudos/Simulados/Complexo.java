public class Complexo
{
    private int a;
    private int b;

    public Complexo (int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public Complexo mais (Complexo outro) throws Exception
    {
        if (outro == null) throw new Exception("Complexo invalido");
        int a = this.a + outro.a;
        int b = this.b + outro.b;
        return new Complexo(a, b);
    }

    public Complexo menos (Complexo outro) throws Exception
    {
        if (outro == null) throw new Exception("Complexo invalido");
        int a = this.a - outro.a;
        int b = this.b - outro.b;
        return new Complexo(a, b);
    }

    public Complexo vezes (Complexo outro) throws Exception
    {
        if (outro == null) throw new Exception("Complexo invalido");
        int a = this.a * outro.a - this.b * outro.b;
        int b = this.a * outro.b + outro.a * this.b;
        return new Complexo(a, b);
    }

    public Complexo divididoPor (Complexo outro) throws Exception
    {
        if (outro == null) throw new Exception("Complexo invalido");

        int denominador = outro.a * outro.a + outro.b * outro.b;
        if (denominador == 0) throw new Exception("Divisao por zero");

        int a = (this.a * outro.a + this.b * outro.b) / denominador;
        int b = (outro.a * this.b - this.a * outro.b) / denominador;
        return new Complexo(a, b);
    }

    @Override
    public String toString ()
    {
        if (this.b>= 0) return this.a + " + " + this.b + "i";

        return this.a + " - " + (-this.b) + "i";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
    }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
    }

    Complexo outro = (Complexo) obj;

        if (this.a == outro.a && this.b == outro.b) {
            return true;
    }

        return false;
}

    @Override
    public int hashCode() {
        
    int resultado = 1;

    resultado = resultado * 2 + ((Integer) this.a).hashCode();
    resultado = resultado * 2 + ((Integer) this.b).hashCode();

    if (resultado < 0) resultado = -resultado;
    return resultado;
}
}



