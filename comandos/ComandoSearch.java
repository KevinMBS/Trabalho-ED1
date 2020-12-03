package TrabalhoED1.comandos;

import TrabalhoED1.elementos.Arquivo;
import TrabalhoED1.elementos.Diretorio;
import TrabalhoED1.exceptions.DiretorioInexistenteException;
import TrabalhoED1.exceptions.FaltaOperandoException;
import TrabalhoED1.exceptions.SearchException;
import TrabalhoED1.funcoes.Funcao;
import TrabalhoED1.lista.ListaEncadeada;
import TrabalhoED1.path.InterpretaPath;

public class ComandoSearch implements Funcao{
    //Comando feito por Alison e Gabriel
    private String[] resComando;
    
    @Override
    public void fazFuncao(ListaEncadeada lista, String... resComando) throws Exception {
        Arquivo dir;

        if (resComando.length == 1){
            throw new FaltaOperandoException(resComando[0]);
        }else if (resComando.length == 2){
            //não recursivo sem path
            lista.search(resComando[1]);
        }else if (resComando.length == 3) {
            if((resComando[1]).equals("-R")== true){
                //recursivo sem path
                lista.searchRec(resComando[2],".");
            }else{
                //não recursivo com path
                dir = InterpretaPath.interpreta(lista, resComando[1]);
                ((Diretorio)dir).getDir().search(resComando[2]);
            }
            
            
        }else if (resComando.length == 4){
            //recursivo com path           
            dir = InterpretaPath.interpreta(lista, resComando[1]);            
            ((Diretorio)dir).getDir().searchRec(resComando[3], ".");
            
        }
    }
    
}
