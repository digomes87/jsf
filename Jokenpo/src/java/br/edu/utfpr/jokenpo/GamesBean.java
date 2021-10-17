package br.edu.utfpr.jokenpo;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.Random;

/**
 *
 * @author dgomes
 */
@SessionScoped
@Named
public class GamesBean implements Serializable {

    private String jogadaJogador = "";
    private String jogadaMaquina = "";
    private int winCountJogador = 0;
    private int winCountMaquina = 0;
    private int drawCount = 0;
    private String resultado;

    public int getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public String getJogadaJogador() {
        return jogadaJogador;
    }

    public void setJogadaJogador(String jogadaJogador) {
        this.jogadaJogador = jogadaJogador;
    }

    public int getWinCountJogador() {
        return winCountJogador;
    }

    public void setWinCountJogador(int winCountJogador) {
        this.winCountJogador = winCountJogador;
    }

    public int getWinCountMaquina() {
        return winCountMaquina;
    }

    public void setWinCountMaquina(int winCountMaquina) {
        this.winCountMaquina = winCountMaquina;
    }

    public String getjogadaJogador() {
        return jogadaJogador;
    }

    public void setjogadaJogador(String jogadaJogador) {
        this.jogadaJogador = jogadaJogador;
    }

    public String getJogadaMaquina() {
        int compNum;
        jogadaMaquina = "";
        Random rnd = new Random();
        compNum = rnd.nextInt(3) + 1;
        if (compNum == 1) {
            jogadaMaquina = "pedra";
        }
        if (compNum == 2) {
            jogadaMaquina = "papel";
        }
        if (compNum == 3) {
            jogadaMaquina = "tesoura";
        }

        return jogadaMaquina;
    }

    public void setJogadaMaquina(String jogadaMaquina) {
        this.jogadaMaquina = jogadaMaquina;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String Vencedor() {

        if (jogadaJogador.equals(jogadaMaquina)) {
            resultado = "Empate";
            drawCount += 1;
        }

        if (jogadaJogador.equals("papel") & (jogadaMaquina.equals("pedra"))) {
            resultado = "Você Venceu";
            winCountJogador += 1;
        }

        if (jogadaJogador.equals("pedra") & (jogadaMaquina.equals("tesoura"))) {
            resultado = "Você Venceu";
            winCountJogador += 1;
        }

        if (jogadaJogador.equals("tesoura") & (jogadaMaquina.equals("papel"))) {
            resultado = "Você Venceu";
            winCountJogador += 1;
        }

        if (jogadaMaquina.equals("pedra") & (jogadaJogador.equals("tesoura"))) {
            resultado = "Maquina Venceu";
            winCountMaquina += 1;
        }
        if (jogadaMaquina.equals("papel") & (jogadaJogador.equals("pedra"))) {
            resultado = "Maquina Venceu";
            winCountMaquina += 1;
        }
        if (jogadaMaquina.equals("tesoura") & (jogadaJogador.equals("papel"))) {
            resultado = "Maquina Venceu";
            winCountMaquina += 1;
        }

        return resultado;
    }

    public int totalpartidas() {
        int total = winCountJogador+winCountMaquina+drawCount;
        
        return total;
    }

    
    
    
    /*
        Material de apoio utilizado no exercicio:
        1 - https://www.youtube.com/watch?v=t8YdYitKEC0
        2 - https://www.codegrepper.com/code-examples/javascript/jsf+random+number+html
        3 - https://www.youtube.com/watch?v=48ziUGDQ9ZM&list=PLi-pH2tKqA2BuyViCIt6QR9Zd9nx8blGf&index=3
        4 - https://www.youtube.com/watch?v=jzi9tAXJ9kQ
    
    */
}
