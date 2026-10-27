public class AlunoSimples
{
    private String nome;
    private int ra;

    public AlunoSimples(String nome, int ra) throws Exception
    {
        if (nome == null || nome.length() == 0) throw new Exception("Nome invalido");
        if (ra <= 0) throw new Exception("RA invalido");
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() { return this.nome; }
    public int getRa() { return this.ra; }

    @Override
    public String toString()
    {
        return this.nome + " (RA " + this.ra + ")";
    }

    // O enunciado NÃO diz "aluno maior que outro". Pense: ainda assim
    // faz sentido implementar compareTo aqui? Por qual critério, se sim?
    // Se decidir que não faz sentido, não implemente — só comente o porquê.
}
