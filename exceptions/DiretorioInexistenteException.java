/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoED1.exceptions;

/**
 *
 * @author Rafael
 */
public class DiretorioInexistenteException extends Exception{
    public DiretorioInexistenteException(String op){
        super("mkdir: cannot create directory '" + op + "': No such file or directory");
    }
}
