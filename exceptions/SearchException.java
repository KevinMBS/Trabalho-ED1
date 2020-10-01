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
public class SearchException extends Exception{
    public SearchException(String op){
        super("Search: searchkey " + op + " not found.");
    }
}
