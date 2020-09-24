/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoed1.comandos;

import trabalhoed1.exceptions.ArquivoExistenteException;
import trabalhoed1.funcoes.Funcao;
import trabalhoed1.lista.ListaEncadeada;

/**
 *
 * @author Rafael
 */
public class ComandoTouch implements Funcao{

    private String[] resComando;
    
    @Override
    public void fazFuncao(ListaEncadeada lista, String... resComando) throws Exception {
        if(resComando.length == 2){
            if(lista.procuraArquivo(resComando[1]))
                throw new ArquivoExistenteException(resComando[1]);
            lista.addArquivo(resComando[1]);
            System.out.println("Arquivo adicionado com sucesso");
        }else{
            
            
        }
    }
    
}
