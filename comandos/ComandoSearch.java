package TrabalhoED1.comandos;

import TrabalhoED1.funcoes.Funcao;
import TrabalhoED1.lista.ListaEncadeada;

public class ComandoSearch implements Funcao{
    //Comando feito por Alison e Gabriel
    private String[] resComando;
    
    @Override
    public void fazFuncao(ListaEncadeada lista, String... resComando) throws Exception {
        //Placeholder d+
        System.out.println("Comando Search");
        this.resComando = resComando;
        for(String str : resComando){
            System.out.println(str);
        }
    }
    
}
