package TrabalhoED1.exceptions;

public class NaoEDiretorioException extends Exception{
    public NaoEDiretorioException(String op){
        super("Command failed: " + op + " is not a directory //placeholder");
    }
}
