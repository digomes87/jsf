package br.exercicio.utfpr.primeiroprojeto;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.enterprise.cdi;

/**
 *
 * @author dgomes
 */

@SessionScoped
@Named
public class NomesBean implements Serializable{
    private String nome;
    private String sobrenome;
    private String mensagem;
    
    public void dizerOla(){
        mensagem = "Olá "+ nome + " " + sobrenome ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobrenome;
    }

    public void setSobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
   
}