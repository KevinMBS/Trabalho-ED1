/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoED1.comandos;

import TrabalhoED1.elementos.Diretorio;
import TrabalhoED1.exceptions.ArquivoExistenteException;
import TrabalhoED1.exceptions.DiretorioExistenteException;
import TrabalhoED1.exceptions.DiretorioInexistenteException;
import TrabalhoED1.funcoes.Funcao;
import TrabalhoED1.lista.ListaEncadeada;
import TrabalhoED1.path.InterpretaPath;

/**
 *
 * @author Rafael
 */
public class ComandoTouch implements Funcao{

    private String[] resComando;
    
    @Override
    public void fazFuncao(ListaEncadeada lista, String... resComando) throws Exception {
        int index;
        
        if(resComando.length == 2){
            if(resComando[1].contains("/")){
                index = resComando[1].lastIndexOf('/');
                Diretorio dir = (Diretorio)InterpretaPath.interpreta(lista, resComando[1].substring(0, index));
                if(dir == null){
                    throw new DiretorioInexistenteException(resComando[0], resComando[1]);
                }else{
                    if(dir.getDir().procuraArquivo(resComando[1].substring(index+1)))
                        throw new ArquivoExistenteException(resComando[1]);
                    dir.getDir().addArquivo(resComando[1].substring(index+1));
                    System.out.println("Arquivo adicionado com sucesso");
                }
            }else{
                if(lista.procuraArquivo(resComando[1]))
                    throw new ArquivoExistenteException(resComando[1]);
                lista.addArquivo(resComando[1]);
                System.out.println("Arquivo adicionado com sucesso");
            }
        }
    }
    
}
