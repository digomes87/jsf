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

    String jogadaJogador;
    String jogadaMaquina;

    
    
    public String JogadaMaquina(){
        int compNum;
        jogadaMaquina = "";
        Random random = new Random();
        compNum = random.nextInt(3) + 1 ;
        if(compNum == 1)
            jogadaMaquina = "pedra";
        if(compNum == 2)
            jogadaMaquina = "papel";
        if(compNum == 3)
            jogadaMaquina = "tesoura";
        
        return jogadaMaquina;
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
        Random random = new Random();
        compNum = random.nextInt(3) + 1 ;
        if(compNum == 1)
            jogadaMaquina = "pedra";
        if(compNum == 2)
            jogadaMaquina = "papel";
        if(compNum == 3)
            jogadaMaquina = "tesoura";
        
        return jogadaMaquina;
    }

    public void setJogadaMaquina(String jogadaMaquina) {
        this.jogadaMaquina = jogadaMaquina;
    }
    
    
    
    
//    private String resultado;
//
//    
//    public void getResultado(){
//        resultado = "Tua jogada ";
//    }

    
//
//    public String getResultado() {
//        return resultado;
//    }
//
//    public void setResultado(String resultado) {
//        this.resultado = resultado;
//    }
//    
}
