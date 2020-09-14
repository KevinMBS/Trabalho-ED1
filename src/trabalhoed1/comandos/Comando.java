package trabalhoed1.comandos;

import trabalhoed1.funcoes.Funcao;

public interface Comando {
    public abstract String getOpcao();
    public abstract Funcao getFuncao();
}
