/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoED1.comandos;

import TrabalhoED1.exceptions.DiretorioExistenteException;
import TrabalhoED1.funcoes.Funcao;
import TrabalhoED1.lista.ListaEncadeada;

/**
 *
 * @author Rafael
 */
public class ComandoMkdir implements Funcao{
    
    private String[] resComando;

    @Override
    public void fazFuncao(ListaEncadeada lista, String... resComando) throws Exception {
        if(resComando.length == 2){
            if(lista.procuraArquivo(resComando[1]))
                throw new DiretorioExistenteException(resComando[1]);
            lista.addDiretorio(resComando[1]);
            System.out.println("Diretório adicionado com sucesso");
        }else{
            
            
        }
        
    }
    
}
