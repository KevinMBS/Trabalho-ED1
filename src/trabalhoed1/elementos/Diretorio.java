/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoed1.elementos;

import trabalhoed1.lista.ListaEncadeada;

/**
 *
 * @author Kevin
 */
public class Diretorio extends Arquivo{
    private ListaEncadeada dir;

    public ListaEncadeada getDir() {
        return dir;
    }

    public void setDir(ListaEncadeada dir) {
        this.dir = dir;
    }
    
    public Diretorio(String chave) {
        super(chave);
    }
    
}
