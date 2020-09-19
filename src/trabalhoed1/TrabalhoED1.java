package trabalhoed1;

import Lista.ListaEncadeada;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalhoed1.comandos.ComandoLinux;

/*
 * @author Kevin
 */
public class TrabalhoED1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String op;
        ListaEncadeada lista = new ListaEncadeada();
        
        
        System.out.println("Bem vindo ao terminal, digite um comando para iniciar:");
        op = input.nextLine();
        
        while(!op.equals("exit")){
            String[] comandoStrArray = op.split("\\s");
            
            try {
                ComandoLinux comando = ComandoLinux.opcaoPelaString(comandoStrArray[0]);
                
                comando.getFuncao().fazFuncao();
                
                
            } catch (Exception ex) {
                System.err.print(ex.getMessage() + "\n");
            }
            
            op = input.nextLine();
            
        }
        
    }
    
}
