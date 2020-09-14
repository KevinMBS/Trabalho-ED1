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
public class ComandoInvalidoException extends Exception{

    public ComandoInvalidoException(String op) {
        super("Bash: " + op + ": command not found");
    }
    
}
