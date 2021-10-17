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
    String  choose;
//    private String resultado;
//
//    
//    public void getResultado(){
//        resultado = "Tua jogada ";
//    }
    
//    public String JogadaMaquina(){
//        int compNum;
//        String compjogada = "";
//        Random random = new Random();
//        compNum = random.nextInt(3) + 1 ;
//        if(compNum == 1)
//            compjogada = "pedra";
//        if(compNum == 2)
//            compjogada = "papel";
//        if(compNum == 3)
//            compjogada = "tesoura";
//        
//        return compjogada;
//    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }
    
    
  
    public String jogadaJogador(){
        return choose;
    }
    
       
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
