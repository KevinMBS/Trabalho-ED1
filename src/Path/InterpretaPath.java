
package Path;

import Lista.ListaEncadeada;
import trabalhoed1.elementos.Arquivo;
import trabalhoed1.exceptions.PathInvalidoException;

public abstract class InterpretaPath {
    private static String[] dirsAVisitar;
    
    public static Arquivo interpreta(ListaEncadeada lista, String path) throws PathInvalidoException{
        dirsAVisitar = path.split("\\");
        ListaEncadeada dirAtual = lista;
        Arquivo atual = null;
        
        for(String dir:dirsAVisitar){
            try{
                atual = dirAtual.getRaiz();
            }catch(Exception e){
                //sei que deu merda mas não sei oq fazer
                throw new PathInvalidoException("");
            }
            Arquivo aux = new Arquivo(dir);
            while(true){
                if(atual == null){
                    //chegou ao fim da lista,logo diretorio não existe
                    throw new PathInvalidoException("");
                    
                }
                if(atual.equals(aux)){
                    //encontrou
                    break;
                }
                atual = atual.getProx();
            }
            
            try{
                dirAtual = atual.getDir();       
            }catch(RuntimeException e){
                //sei que deu merda mas não sei oq fazer
                throw new PathInvalidoException("");
            }
            
        }
        return atual;
           
    }
}
