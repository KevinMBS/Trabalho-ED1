/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoed1.elementos;

/**
 *
 * @author Kevin
 */
public class Arquivo {
    private String chave;
    private Arquivo prox;
    
    public Arquivo(String chave){
        this.chave = chave;
        this.prox = null;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Arquivo){
            if(this.chave.equals(((Arquivo)obj).chave)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
