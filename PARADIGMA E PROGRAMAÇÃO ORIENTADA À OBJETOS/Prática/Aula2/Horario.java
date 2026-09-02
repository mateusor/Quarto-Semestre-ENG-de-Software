public class Horario
{
    private byte hora, minuto, segundo;

    public /*void*/ Horario (byte hora, byte minuto, byte segundo) throws Exception
    {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public void setHora (byte hora) throws Exception
    {
        if(hora < 0 || hora > 23){
            throw new Exception("Hora invalida, a hora deve ser entre 0 e 23");
        }
        this.hora=hora;
    }

    public void setMinuto (byte minuto) throws Exception
    {
        if(minuto < 0 || minuto > 59){
            throw new Exception("Minuto invalido, minuto deve ser entre 0 e 59");
        }
        this.minuto=minuto;
    }

    public void setSegundo (byte segundo) throws Exception
    {
        if(segundo < 0 || segundo > 59){
            throw new Exception("Segundo invalido, segundo deve ser entre 0 e 59");
        }
        this.segundo = segundo;
    }

    public byte getHora ()
    {
        return this.hora;
    }

    public byte getMinuto ()
    {
        return this.minuto;
    }

    public byte getSegundo ()
    {
        return this.segundo;
    }

    public void adiante (int qtdSegundos) throws Exception
    {
        int totalAtual = this.hora * 3600 + this.minuto * 60 + this.segundo;
        int novoTotal = Math.floorMod(totalAtual + qtdSegundos, 86400);

        this.setHora((byte)(novoTotal / 3600));
        this.setMinuto((byte)((novoTotal % 3600) / 60));
        this.setSegundo((byte)(novoTotal % 60));
    }

    public void retroceda (int qtdSegundos) throws Exception
    {
        this.adiante(-qtdSegundos);
    }

    public Horario getHorarioFuturo (int qtdSegundos) throws Exception // nao altera o this
    {
        Horario novo = new Horario(this.hora, this.minuto, this.segundo);
        novo.adiante(qtdSegundos);
        return novo;
    }

    public Horario getHorarioPassado (int qtdSegundos) throws Exception // nao altera o this
    {
        Horario novo = new Horario(this.hora, this.minuto, this.segundo);
        novo.retroceda(qtdSegundos);
        return novo;
    }

    @Override
    public String toString ()
    {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        Horario outro = (Horario) obj;
        return this.hora == outro.hora
            && this.minuto == outro.minuto
            && this.segundo == outro.segundo;
    }

    @Override
    public int hashCode ()
    {
        int resultado = 17;
        resultado = 31 * resultado + this.hora;
        resultado = 31 * resultado + this.minuto;
        resultado = 31 * resultado + this.segundo;
        return resultado;
    }
}