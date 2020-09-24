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
public class ArquivoExistenteException extends Exception{
    public ArquivoExistenteException(String op){
        super("touch: File " + op + " already exists");
    }
}
