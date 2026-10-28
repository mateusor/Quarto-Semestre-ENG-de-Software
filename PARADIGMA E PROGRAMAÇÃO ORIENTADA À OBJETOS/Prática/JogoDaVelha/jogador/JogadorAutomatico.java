package jogador;

import jogo.Marca;
import jogo.Tabuleiro;

public class JogadorAutomatico implements Jogador
{
    private Marca     marca     = null;
    private Tabuleiro tabDoJogo = null;

    public JogadorAutomatico (Tabuleiro tab) throws Exception
    {   tabDoJogo = tab;
        // atribuir tab para tabDoJogo
        // fazer o jogador escolher sua marca
        // via sorteio de numeros aleatorio
        if ((int)(Math.random()*2) == 0)
            marca=new Marca('X');
        else
            marca=new Marca('O');
    }

    public JogadorAutomatico (Tabuleiro tab, Marca mrc) throws Exception
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
        try
        {
            // tentando ganhar na linha 0
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando ganhar na linha 1
            if (!this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            // tentando ganhar na linha 2
            if (!this.tabDoJogo.haMarcaNaPosicao(2,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na coluna 0
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando ganhar na coluna 1
            if (!this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando ganhar na coluna 2
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal principal
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal secundaria
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando atrapalhar vitoria na linha 0
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando atrapalhar vitoria na linha 1
            if (!this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            // tentando atrapalhar vitoria na linha 2
            if (!this.tabDoJogo.haMarcaNaPosicao(2,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na coluna 0
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,0) && !this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando atrapalhar vitoria na coluna 1
            if (!this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && !this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,1) && !this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            // tentando atrapalhar vitoria na coluna 2
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && !this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal principal
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal secundaria
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 0
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                !this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 1
            if ( this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 2
            if ( this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(2,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(2,0) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 0
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,0) && this.tabDoJogo.getMarcaNaPosicao(1,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 1
            if ( this.tabDoJogo.haMarcaNaPosicao(0,1) && this.tabDoJogo.getMarcaNaPosicao(0,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,1))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,1) && this.tabDoJogo.getMarcaNaPosicao(2,1).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,1);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 2
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,2);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,2) && this.tabDoJogo.getMarcaNaPosicao(1,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal principal
            if ( this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal secundaria
            if ( this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                 this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                 this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                 this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            // termine jogando num lugar qualquer que esteja livre
            {
                boolean jogou = false;

                for (int lin=0; lin<3 && !jogou; lin++)
                    for (int col=0; col<3 && !jogou; col++)
                        if (!this.tabDoJogo.haMarcaNaPosicao(lin,col))
                        {
                            this.tabDoJogo.setMarcaNaPosicao(this.marca, lin,col);
                            jogou = true;
                        }
            }
        }
        catch (Exception erro)
        {} // ignorando pois sei que n o estou usando posicao invalida nem comparando com equals um null
    }
}