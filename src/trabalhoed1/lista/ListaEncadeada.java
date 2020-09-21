package trabalhoed1.lista;

import trabalhoed1.elementos.Arquivo;

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
        return;
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
    
    
}
