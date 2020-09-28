package TrabalhoED1;

import TrabalhoED1.lista.ListaEncadeada;
import java.util.Scanner;
import TrabalhoED1.comandos.ComandoLinux;

public class TrabalhoED1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String op;
        ListaEncadeada lista = new ListaEncadeada();
        
        System.out.println("Bem vindo ao terminal, digite um comando para iniciar:");
        op = input.nextLine();
        
        while(!op.equals("exit")){
            String[] comandoStrArray = op.split("\\s");
            //separa o comando dado pelo usuario em um array de Strings
            
            try {
                ComandoLinux comando = ComandoLinux.opcaoPelaString(comandoStrArray[0]);
                comando.getFuncao().fazFuncao(lista, comandoStrArray);
                //A opção feita pelo usuario é recebida através de uma classe de Enum
            } catch (Exception ex) {
                System.err.print(ex.getMessage() + "\n");
            }
            
            op = input.nextLine();
            
        }
        
    }
    
}
