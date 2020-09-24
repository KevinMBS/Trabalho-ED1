/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoed1.exceptions;

/**
 *
 * @author Rafael
 */
public class ArquivoExistenteException extends Exception {
    
    public ArquivoExistenteException(String op){
        super("mkdir: cannot create directory '" + op + "': File exists");
    }
    
}
