public class Funcionario
{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) throws Exception
    {
        this.setNome(nome);
        this.setSalario(salario);
    }

    public void setNome(String nome) throws Exception
    {
        if (nome == null || nome.length() == 0) throw new Exception("Nome invalido");
        this.nome = nome;
    }

    public void setSalario(double salario) throws Exception
    {
        if (salario <= 0) throw new Exception("Salario invalido");
        this.salario = salario;
    }

    public String getNome() { return this.nome; }
    public double getSalario() { return this.salario; }

    @Override
    public String toString()
    {
        return "Funcionario: " + this.nome + " - R$" + this.salario;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Funcionario outro = (Funcionario) obj;
        if (this.nome.equals(outro.nome) && this.salario == outro.salario) return true;
        return false;
    }

    @Override
    public int hashCode()
    {
        int resultado = 1;
        resultado = 2 * resultado + this.nome.hashCode();
        resultado = 2 * resultado + ((Double) this.salario).hashCode();
        if (resultado < 0) resultado = -resultado;
        return resultado;
    }

    // -------------------------------------------
    // implemente o construtor de copia e o clone()
    // -------------------------------------------


    public Funcionario (Funcionario modelo)throws Exception{
        if(modelo == null){
            throw new Exception("modelo Ausente");
        }

        this.nome = modelo.nome;
        this.salario = modelo.salario;
    }

    @Override

    public Object clone(){
        
        Funcionario retorno = null;

        try{
             retorno = new Funcionario(this);
        }

        catch(Exception e){}

        return retorno;
    }
}