public class Corredor implements Comparable<Corredor>
{
    private String nome;
    private double tempoSegundos; // tempo para completar a prova

    public Corredor(String nome, double tempoSegundos) throws Exception
    {
        if (nome == null || nome.length() == 0) throw new Exception("Nome invalido");
        if (tempoSegundos <= 0) throw new Exception("Tempo invalido");
        this.nome = nome;
        this.tempoSegundos = tempoSegundos;
    }

    public String getNome() { return this.nome; }
    public double getTempoSegundos() { return this.tempoSegundos; }

    @Override
    public String toString()
    {
        return this.nome + ": " + this.tempoSegundos + "s";
    }

    // compara this e outro pela VELOCIDADE (nao pelo tempo bruto):
    // tempo MENOR = corredor "maior" (mais rapido)
    @Override
    public int compareTo(Corredor outro)
    {
        if (this.tempoSegundos < outro.tempoSegundos) {
            return 1;
        }

        if (this.tempoSegundos > outro.tempoSegundos) {
            return -1;
        }

        return 0;
    }
}