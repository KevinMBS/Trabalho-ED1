package TrabalhoED1.comandos;

import TrabalhoED1.elementos.Arquivo;
import TrabalhoED1.elementos.Diretorio;
import TrabalhoED1.exceptions.DiretorioInexistenteException;
import TrabalhoED1.exceptions.NaoEDiretorioException;
import TrabalhoED1.funcoes.Funcao;
import TrabalhoED1.lista.ListaEncadeada;
import TrabalhoED1.path.InterpretaPath;

public class ComandoLs implements Funcao{
    //Comando feito por Kevin
    private String[] resComando;
    
    @Override
    public void fazFuncao(ListaEncadeada lista, String... resComando) throws Exception {
        //placeholdeeer, faz sua parte Keeevin
        Arquivo dir;      
        if(resComando.length == 1){
            lista.printLista("");
        }else if(resComando[1].equals("-R")){
            //recursiva
            if(resComando.length == 3){
                dir = InterpretaPath.interpreta(lista,resComando[2]);
            }else{
                dir = lista.getRaiz();
            }
            if(dir == null){ //Diretorio não existe
                throw new DiretorioInexistenteException(resComando[0], resComando[1]);
            }else if(!(dir instanceof Diretorio)){ //Ou seja, se ele for um arquivo base não é possivel imprir seu conteudo no nosso sistema
                 System.out.println(""+dir.getChave());
            }else{
                ListaEncadeada.printListaRecursivo(".",dir);
            } 
        }else{
            //não recursiva
            dir = InterpretaPath.interpreta(lista,resComando[1]);
            if(dir == null){ //Diretorio não existe
                throw new DiretorioInexistenteException(resComando[0], resComando[1]);
            }else if(!(dir instanceof Diretorio)){ //Ou seja, se ele for um arquivo base não é possivel imprir seu conteudo no nosso sistema
                System.out.println(""+dir.getChave());
            }else{
                ((Diretorio)dir).getDir().printLista(dir.getChave());
        
            }
        }
    }
    
}
