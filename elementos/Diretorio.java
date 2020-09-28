package TrabalhoED1.elementos;

import TrabalhoED1.lista.ListaEncadeada;

public class Diretorio extends Arquivo{
    private ListaEncadeada dir;

    public Diretorio(String chave) {
        super(chave);
        dir = new ListaEncadeada();
    }
    
    public ListaEncadeada getDir() {
        return dir;
    }

    public void setDir(ListaEncadeada dir) {
        this.dir = dir;
    }
    
}
