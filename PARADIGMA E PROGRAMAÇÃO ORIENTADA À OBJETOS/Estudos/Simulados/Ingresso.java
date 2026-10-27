public class Ingresso implements Cloneable {

    private int codigo;
    private String nomeEvento;
    private double preco;

    public Ingresso(int codigo, String nomeEvento, double preco) throws Exception {

        this.setCodigo(codigo);
        this.setNomeEvento(nomeEvento);
        this.setPreco(preco);
    }

    public void setCodigo(int codigo) throws Exception {

        if (codigo <= 0) {

            throw new Exception("O valor do codigo não pode ser negativo");
        }

        this.codigo = codigo;
    }

    public void setNomeEvento(String nomeEvento) throws Exception {

        if (nomeEvento == null || nomeEvento.length() == 0) {

            throw new Exception("O nome do evento esta invalido");
        }

        this.nomeEvento = nomeEvento;
    }

    public void setPreco(double preco) throws Exception {

        if (preco <= 0) {

            throw new Exception("O valor do preco não pode ser negativo");
        }

        this.preco = preco;
    }

    public int getCodigo() {

        return this.codigo;
    }

    public String getNomeEvento() {

        return this.nomeEvento;
    }

    public double getPreco() {

        return this.preco;
    }

    @Override
    public String toString() {

        return "Ingresso[nome:" + this.nomeEvento + " codigo:" + this.codigo + " preco: " + this.preco + "]";
    }

    @Override
    public boolean equals(Object obj) {

    if (obj == this){

         return true;
    }

    if (obj == null || obj.getClass() != this.getClass()){
        return false;
    }

    Ingresso outro = (Ingresso) obj;

    if (this.codigo == outro.codigo && this.nomeEvento.equals(outro.nomeEvento) && this.preco == outro.preco) {
        return true;
    }

    return false;
}

    @Override
    public int hashCode()
{
    int resultado = 1;

    resultado = resultado * 2 + ((Integer) this.codigo).hashCode();
    resultado = resultado * 2 + this.nomeEvento.hashCode();
    resultado = resultado * 2 + ((Double) this.preco).hashCode();

    if (resultado < 0){

         resultado = -resultado;
    }

    return resultado;
}

    // construtor de cópia
    public Ingresso(Ingresso c) throws Exception {

        if (c == null) throw new Exception("Modelo ausente");

        this.codigo = c.codigo;
        this.nomeEvento = c.nomeEvento;
        this.preco = c.preco;
    }

    @Override
    public Object clone() {

        Ingresso retorno = null;

        try {
            retorno = new Ingresso(this);
        }
        catch (Exception erro) {} 

        return retorno;
    }

    @Override 
    public Retangulo (Retangulo)
}