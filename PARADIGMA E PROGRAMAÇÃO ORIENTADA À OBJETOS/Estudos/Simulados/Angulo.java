public class Angulo
{
    private double valorEmGraus;

    public Angulo(double valorEmGraus) throws Exception
    {
        this.setValorEmGraus(valorEmGraus);
    }

    public void setValorEmGraus(double valorEmGraus) throws Exception
    {
        if (valorEmGraus < -360 || valorEmGraus > 360) {
            throw new Exception("Angulo invalido");
        }

        this.valorEmGraus = valorEmGraus;
    }

    public void setValorEmGrados(double valorEmGrados) throws Exception
    {
        if (valorEmGrados < -400 || valorEmGrados > 400) {
            throw new Exception("Angulo invalido");
        }

        this.valorEmGraus = valorEmGrados * (360.0 / 400.0);
    }

    public void setValorEmRadianos(double valorEmRadianos) throws Exception
    {
        double pi = 3.14159265358979;

        if (valorEmRadianos < -2 * pi || valorEmRadianos > 2 * pi) {
            throw new Exception("Angulo invalido");
        }

        this.valorEmGraus = valorEmRadianos * (180.0 / pi);
    }

    public double getValorEmGraus()
    {
        return this.valorEmGraus;
    }

    public double getValorEmGrados()
    {
        return this.valorEmGraus * (400.0 / 360.0);
    }

    public double getValorEmRadianos()
    {
        double pi = 3.14159265358979;
        return this.valorEmGraus * (pi / 180.0);
    }
}