public class Cofre implements Cloneable
{
    private double capacidade;
    private double saldoAtual = 0;

    public Cofre(double capacidade) throws Exception
    {
        if (capacidade <= 0) {
            throw new Exception("Capacidade invalida");
        }

        this.capacidade = capacidade;
    }

    public void depositar(double valor) throws Exception
    {
        if (valor <= 0) {
            throw new Exception("Valor invalido");
        }

        if (this.saldoAtual + valor > this.capacidade) {
            throw new Exception("Ultrapassou a capacidade");
        }

        this.saldoAtual = this.saldoAtual + valor;
    }

    public void sacar(double valor) throws Exception
    {
        if (valor <= 0) {
            throw new Exception("Valor invalido");
        }

        if (this.saldoAtual - valor < 0) {
            throw new Exception("Saldo insuficiente");
        }

        this.saldoAtual = this.saldoAtual - valor;
    }

    public double getSaldo()
    {
        return this.saldoAtual;
    }

    public double getCapacidade()
    {
        return this.capacidade;
    }

    @Override
    public String toString()
    {
        return "Cofre: Capacidade: " + this.capacidade + " Valor atual: " + this.saldoAtual;
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

        Cofre outro = (Cofre) obj;

        if (this.capacidade == outro.capacidade && this.saldoAtual == outro.saldoAtual) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int resultado = 1;

        resultado = 2 * resultado + ((Double) this.saldoAtual).hashCode();
        resultado = 2 * resultado + ((Double) this.capacidade).hashCode();

        if (resultado < 0) {
            resultado = -resultado;
        }

        return resultado;
    }

    // compareTo nao implementado: nao ha criterio unico de ordem entre
    // cofres (saldo? capacidade?) - seria arbitrario

    public Cofre(Cofre modelo) throws Exception
    {
        if (modelo == null) {
            throw new Exception("Modelo ausente");
        }

        this.saldoAtual = modelo.saldoAtual;
        this.capacidade = modelo.capacidade;
    }

    @Override
    public Object clone()
    {
        Cofre retorno = null;

        try {
            retorno = new Cofre(this);
        }
        catch (Exception e) {}

        return retorno;
    }
}