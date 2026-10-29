public class Estoque
{
    private String produto;
    private int quantidade;

    public Estoque(String produto, int quantidade) throws Exception
    {
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    public void setProduto(String produto) throws Exception
    {
        if (produto == null || produto.length() == 0) throw new Exception("Produto invalido");
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) throws Exception
    {
        if (quantidade < 0) throw new Exception("Quantidade invalida");
        this.quantidade = quantidade;
    }

    public String getProduto() { return this.produto; }
    public int getQuantidade() { return this.quantidade; }

    @Override
    public String toString()
    {
        return "Estoque: " + this.produto + " (" + this.quantidade + " un.)";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Estoque outro = (Estoque) obj;
        if (this.produto.equals(outro.produto) && this.quantidade == outro.quantidade) return true;
        return false;
    }

    @Override
    public int hashCode()
    {
        int resultado = 1;
        resultado = 2 * resultado + this.produto.hashCode();
        resultado = 2 * resultado + ((Integer) this.quantidade).hashCode();
        if (resultado < 0) resultado = -resultado;
        return resultado;
    }

    // -------------------------------------------
    // implemente o construtor de copia e o clone()
    // -------------------------------------------

    public Estoque (Estoque modelo)throws Exception{

        if(modelo == null){

            throw new Exception("Modelo ausente");
        }

        this.produto = modelo.produto;

        this.quantidade = modelo.quantidade;
    }

    @Override

    public Object clone(){

        Estoque retorno = null;

        try{
            retorno = new Estoque(this);
        }

        catch (Exception e){}

        return retorno;
    }
}