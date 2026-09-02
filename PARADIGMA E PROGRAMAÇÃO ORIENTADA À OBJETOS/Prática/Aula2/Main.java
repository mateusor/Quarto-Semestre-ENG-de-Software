public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Horario h1 = new Horario((byte)10, (byte)30, (byte)45);
            System.out.println("h1 = " + h1);

            // testando adiante
            h1.adiante(20);
            System.out.println("h1 apos adiante(20) = " + h1); // 10:31:05

            // testando retroceda
            h1.retroceda(65);
            System.out.println("h1 apos retroceda(65) = " + h1); // 10:30:00

            // testando virada de dia (adiante)
            Horario h2 = new Horario((byte)23, (byte)59, (byte)50);
            System.out.println("\nh2 = " + h2);
            h2.adiante(20);
            System.out.println("h2 apos adiante(20) = " + h2); // 00:00:10

            // testando virada de dia (retroceda)
            Horario h3 = new Horario((byte)0, (byte)0, (byte)10);
            System.out.println("\nh3 = " + h3);
            h3.retroceda(20);
            System.out.println("h3 apos retroceda(20) = " + h3); // 23:59:50

            // testando getHorarioFuturo (nao altera o original)
            Horario h4 = new Horario((byte)12, (byte)0, (byte)0);
            Horario futuro = h4.getHorarioFuturo(3661); // +1h 1min 1s
            System.out.println("\nh4 = " + h4);
            System.out.println("futuro = " + futuro);   // 13:01:01
            System.out.println("h4 continua = " + h4);  // 12:00:00 (inalterado)

            // testando getHorarioPassado (nao altera o original)
            Horario h5 = new Horario((byte)12, (byte)0, (byte)0);
            Horario passado = h5.getHorarioPassado(3661); // -1h 1min 1s
            System.out.println("\nh5 = " + h5);
            System.out.println("passado = " + passado);  // 10:58:59
            System.out.println("h5 continua = " + h5);   // 12:00:00 (inalterado)

            // testando equals e hashCode
            Horario a = new Horario((byte)8, (byte)0, (byte)0);
            Horario b = new Horario((byte)8, (byte)0, (byte)0);
            Horario c = new Horario((byte)9, (byte)0, (byte)0);

            System.out.println("\na = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("a.equals(b) = " + a.equals(b)); // true
            System.out.println("a.equals(c) = " + a.equals(c)); // false
            System.out.println("a.hashCode() == b.hashCode() -> " + (a.hashCode() == b.hashCode())); // true

            // testando excecao com hora invalida
            System.out.println("\nTestando hora invalida:");
            Horario invalido = new Horario((byte)25, (byte)0, (byte)0);
        }
        catch (Exception e)
        {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}