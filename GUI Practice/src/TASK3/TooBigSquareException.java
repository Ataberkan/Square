package TASK3;

public class TooBigSquareException extends Exception {
    public TooBigSquareException(int max)  {
        super("Maximum length is"+ max);
    }
}
