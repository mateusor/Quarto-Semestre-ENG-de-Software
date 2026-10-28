package jogador;

import jogo.Marca;
import jogo.Tabuleiro;
import java.io.*;

public class JogadorHumano implements Jogador
{
    private Marca          marca     = null;
    private Tabuleiro      tabDoJogo = null;
    private BufferedReader teclado   = new BufferedReader
                                        (new InputStreamReader
                                        (System.in));

    public JogadorHumano (Tabuleiro tab) throws Exception
    {
        // atribuir tab para tabDoJogo
        // pedir para o jogador escolher
        // sua marca e permitir digitacao
        // intanciando marca
        this.tabDoJogo = tab;

        while (this.marca==null)
        {
            try
            {
                System.out.print ("Escolha sua marca (X ou O): ");
                String resposta = this.teclado.readLine ();

                this.marca = new Marca (resposta.toUpperCase().charAt(0));
            }
            catch (Exception erro)
            {
                System.out.println ("Marca invalida! Digite X ou O.");
            }
        }
    }

    public JogadorHumano (Tabuleiro tab, Marca mrc) throws Exception
    {
        // atribuir tab para tabDoJogo
        // e mrc para marca
        this.tabDoJogo = tab;
        this.marca     = mrc;
    }

    public Marca getMarca ()
    {
        // retorna a marca do jogador
        return this.marca;
    }

    public void facaSuaJogada ()
    {
        // pergunta para o jogador onde ele quer
        // jogar, permitindo digitacao e chamando
        // os métodos apropriados de tabDoJogo
        boolean jogou = false;

        while (!jogou)
        {
            try
            {
                System.out.println (this.tabDoJogo);
                System.out.println ("Sua marca: " + this.marca);

                System.out.print ("Em que linha quer jogar (0 a 2)? ");
                int lin = Integer.parseInt (this.teclado.readLine ());

                System.out.print ("Em que coluna quer jogar (0 a 2)? ");
                int col = Integer.parseInt (this.teclado.readLine ());

                if (this.tabDoJogo.haMarcaNaPosicao (lin,col))
                    System.out.println ("Essa posicao ja esta ocupada!");
                else
                {
                    this.tabDoJogo.setMarcaNaPosicao (this.marca, lin,col);
                    jogou = true;
                }
            }
            catch (Exception erro)
            {
                System.out.println ("Posicao invalida! Digite um numero de 0 a 2.");
            }
        }
    }

    public void vcGanhou ()
    {
        // mostra mensagem indicando vitoria
        System.out.println (this.tabDoJogo);
        System.out.println ("Parabens, voce ganhou!");
    }

    public void vcPerdeu ()
    {
        // mostra mensagem indicando derrota
        System.out.println (this.tabDoJogo);
        System.out.println ("Que pena, voce perdeu!");
    }

    public void deuVelha ()
    {
        // mostra mensagem indicando empate
        System.out.println (this.tabDoJogo);
        System.out.println ("Deu velha! Ninguem ganhou.");
    }

    public boolean querMaisUmaPartida ()
    {
        // perguntar se deseja jogar de novo
        // permitindo digitacao e retornando
        // true ou false, conforme a resposta
        String resposta = "";

        try
        {
            while (!resposta.equals("S") && !resposta.equals("N"))
            {
                System.out.print ("Deseja jogar de novo (S/N)? ");
                resposta = this.teclado.readLine ().toUpperCase ();
            }
        }
        catch (Exception erro)
        {
            return false; // erro ou fim da digitacao: encerra
        }

        return resposta.equals("S");
    }
}