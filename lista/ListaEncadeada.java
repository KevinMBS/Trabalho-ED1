package TrabalhoED1.lista;

import TrabalhoED1.elementos.Arquivo;
import TrabalhoED1.elementos.Diretorio;
import java.util.ArrayList;


public class ListaEncadeada {
    private Arquivo raiz;
    
    public ListaEncadeada(){
        this.raiz = null;
    }
    
    public Arquivo getRaiz() {
        return raiz;
    }

    public void setRaiz(Arquivo raiz) {
        this.raiz = raiz;
    }
    
    public void addArquivo(String chave){
        //Adiciona um arquivo ao fim da lista
        Arquivo novoArq = new Arquivo(chave);
        if(this.raiz == null){
            this.raiz = novoArq;
            return;
        }
        novoArq.setProx(null);
        
        Arquivo ultimo = this.raiz;
        while(ultimo.getProx() != null){
            ultimo = ultimo.getProx();
        }
        
        ultimo.setProx(novoArq);
    }
    
    public void addDiretorio(String chave){
        //Adiciona um diretorio ao começo da lista
        Diretorio novoDir = new Diretorio(chave);
        
        novoDir.setProx(this.raiz);
        this.raiz = novoDir;
    }
    
    public void search(String chave){
        //Procura um elemento na lista atual
        Arquivo atual = this.raiz;
        
        while(atual != null){
            if(atual.getChave().equals(chave)){
                System.out.println("./" + atual.getChave());
            }
            atual = atual.getProx();
        }       
    }
    
    public void searchRec(String chave, String caminho){
        ArrayList<Diretorio> dirsAvisitar = new ArrayList<>();
        Arquivo atual = this.raiz;
        //caminho = caminho;
        while(atual != null){           
            if(atual.getChave().equals(chave)){
                System.out.println(caminho + "/" + chave);
            }
            if(atual instanceof Diretorio){
                dirsAvisitar.add((Diretorio)atual);
            }
            atual = atual.getProx();
        }
        for(Diretorio d:dirsAvisitar){
            d.getDir().searchRec(chave, caminho + "/" + d.getChave());
        }
    }
    
    public void printLista(String nomeDir){
        //Mostra os elementos dessa lista
        System.out.println("./"+ nomeDir);
        Arquivo atual = this.raiz;
        if(this.raiz == null){
            //quando o caminho esta vazio simplesmente não mostra nada
            System.out.println();
        }
        
        while(atual != null){
            System.out.println(atual.getChave());
            atual = atual.getProx();
        }
        
    }

    public static void printListaRecursivo(String caminho, Arquivo dir) {
        Arquivo prox = ((Diretorio)dir).getDir().getRaiz();
        ArrayList<Diretorio> dirsAvisitar = new ArrayList<>();
        caminho = caminho.concat("/" + dir.getChave());
        System.out.println("" + caminho);
        
        
        while(prox != null){           
            System.out.println(" " + prox.getChave());
            if(prox instanceof Diretorio){
                dirsAvisitar.add((Diretorio)prox);
            }
            prox = prox.getProx();
        }
        for(Diretorio d:dirsAvisitar){
            printListaRecursivo(caminho, d);
        }
    
    }
    
    public Arquivo procuraArquivo(String chave){
        //Procura um elemento na lista atual
        Arquivo atual = this.raiz;
        
        while(atual != null){
            if(atual.getChave().equals(chave))
                return atual;
            atual = atual.getProx();
        }
        return null;
    }
    
}
