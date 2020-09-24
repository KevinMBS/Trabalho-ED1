package TrabalhoED1.lista;

import TrabalhoED1.elementos.Arquivo;
import TrabalhoED1.elementos.Diretorio;

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
        Diretorio novoDir = new Diretorio(chave);
        
        novoDir.setProx(this.raiz);
        this.raiz = novoDir;
    }
    
    public boolean procuraArquivo(String chave){
        Arquivo atual = this.raiz;
        
        while(atual != null){
            if(atual.getChave().equals(chave))
                return true;
            atual = atual.getProx();
        }
        return false;
    }
    
    public void printLista(){
        Arquivo atual = this.raiz;
        
        if(this.raiz == null){
            System.out.println("Lista vazia");
        }
        
        while(atual != null){
            System.out.println(atual.getChave());
            atual = atual.getProx();
        }
        
    }
    
}
