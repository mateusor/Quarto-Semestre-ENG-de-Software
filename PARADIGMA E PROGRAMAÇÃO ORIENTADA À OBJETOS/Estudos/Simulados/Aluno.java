public class Aluno implements Cloneable{

    private String nome;
    private int ra;
    private double mediaFinal;

    public Aluno (String nome, int ra, double mediaFinal) throws Exception {

        this.setNome(nome);
        this.setRa(ra);
        this.setMedia(mediaFinal);
    }

    public void setNome (String nome) throws Exception{

        if (nome == null || nome.length() == 0){

            throw new Exception ("Nome vazio ou nulo");
        }

        this.nome = nome;
    }

    public void setRa (int ra) throws Exception{

        if (ra <=  0){

            throw new Exception ("ra deve ser positivo");
        }

        this.ra = ra;
    }

    public void setMedia (double mediaFinal) throws Exception{
        
        if (mediaFinal < 0 || mediaFinal > 10){

            throw new Exception ("media deve ser entre 0 e 10 ");
        }

        this.mediaFinal = mediaFinal;
    }

    public String getNome(){

        return this.nome;
    }

    public int getRa() {

        return this.ra;
    }

    public double getMedia(){

        return this.mediaFinal;
    }

    public boolean estaAprovado (){

        if (mediaFinal >= 6){

            return true;
        }

        return false;
    }

    @Override

    public String toString(){

        return "Aluno: [Nome:" + this.nome + "," + "Ra:" + this.ra + "," + "MediaFinal" + this.mediaFinal + "]";
    }

    @Override

    public boolean equals(Object obj){

        if (this == obj){

            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        Aluno outro = (Aluno) obj;

        if (this.nome.equals(outro.nome) && this.ra == outro.ra && this.mediaFinal == outro.mediaFinal){
            
            return true;
        }

        return false;
    }

    @Override

    public int hashCode(){

        int resultado = 1;

        resultado = 2 * resultado + this.nome.hashCode();
        resultado = 2 * resultado + ((Integer) this.ra).hashCode();
        resultado = 2 * resultado + ((Double) this.mediaFinal).hashCode();

        if (resultado < 0){
            
            resultado = -resultado;
        }

        return resultado;
    }

    public Aluno(Aluno modelo) throws Exception
    {
        if (modelo == null) {
            throw new Exception("Modelo ausente");
        }

        this.nome = modelo.nome;
        this.ra = modelo.ra;
        this.mediaFinal = modelo.mediaFinal;
    }

    @Override

    public Object clone(){

        Aluno retorno = null;

        try{

            return new Aluno(this);
        }

        catch (Exception e){}

        return retorno;

    }
    
}