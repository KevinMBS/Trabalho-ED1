package TrabalhoED1.comandos;

import TrabalhoED1.funcoes.Funcao;
import TrabalhoED1.lista.ListaEncadeada;

public class ComandoLs implements Funcao{
    //Comando feito por Kevin
    private String[] resComando;
    
    @Override
    public void fazFuncao(ListaEncadeada lista, String... resComando) throws Exception {
        //placeholdeeer, faz sua parte Keeevin
        if(resComando.length == 1){
            lista.printLista();
        }
    }
    
}
