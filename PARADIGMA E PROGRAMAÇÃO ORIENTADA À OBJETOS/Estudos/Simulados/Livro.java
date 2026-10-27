public class Livro{

    private String titulo;
    private String autor;
    private short paginas;

    public Livro (String titulo, String autor, short paginas) throws Exception{

        if (titulo == null || titulo.length() == 0){
            throw new Exception ("O titulo não pode ser nulo ou vazio");
        }

        if (autor == null || autor.length() == 0){
            throw new Exception ("O autor não pode ser nulo ou vazio");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.setPaginas (paginas);
    }

    public void setPaginas (short paginas) throws Exception{

        if (paginas <= 0){

            throw new Exception ("O numero de paginas deve ser positivo.");
        }

        this.paginas = paginas;
    }

    public String getTitulo(){

        return this.titulo;
    }

    public String getAutor(){

        return this.autor;
    }

    public short getPaginas(){

        return this.paginas;
    }

    public boolean ehMaiorQue (Livro outro) throws Exception{

        if (outro == null){

            throw new Exception ("O numero de paginas nao pode ser nulo");
        }

        if (this.paginas > outro.paginas){
            
            return true;
        }

        return false;
    }

    @Override

    public String toString(){

        return "Livro: [Titulo: "+ this.titulo +" Autor: " + this.autor + "Paginas: " + this.paginas + "]";
    }

    @Override

    public boolean equals(Objcet obj){

        if (this == obj){
            
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){

            return false;
        }

        Livro outro = (Livro) obj;

        if (this.titulo.equals(outro.titulo) && this.autor.equals(outro.autor) && this.paginas == outro.paginas){
            
            return true;
        }

        return false;
}
    @Override 

    public int hashCode() {

        int resultado = 1;

        resultado = 2 * resultado + this.titulo.hashCode();
        resultado = 2 * resultado + this.autor.hashCode();
        resultado = 2 * resultado + ((Short) this.paginas).hashCode();

        if(resultado < 0){
            
            resultado = - resultado;
        }

        return resultado;
    }

    

    public Livro (Livro l) throws Exception{

        if (l == null){

            throw new Exception ("Modelo ausente");
        }

        this.titulo = l.titulo;
        this.autor = l.autor;
        this.paginas = l.paginas;
    }

    @Override

    public Object clone(){

        Livro retorno = null;

        try
        {
            retorno = new Livro(this);
        }

        catch (Exception erro){}

        return retorno;
    }

}