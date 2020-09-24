
package TrabalhoED1.path;

import TrabalhoED1.lista.ListaEncadeada;
import TrabalhoED1.elementos.Arquivo;
import TrabalhoED1.elementos.Diretorio;
import TrabalhoED1.exceptions.PathInvalidoException;

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
                    
                    //chegou no fim da lista,ou seja, não encontrou o diretório ou arquivo procurado
                    //break;
                }
                if(atual.equals(aux)){
                    //encontrou
                    break;
                }
                atual = atual.getProx();
            }
            if(atual instanceof Diretorio)
                dirAtual = ((Diretorio)atual).getDir();
            
        }
        return atual;
           
    }
}
