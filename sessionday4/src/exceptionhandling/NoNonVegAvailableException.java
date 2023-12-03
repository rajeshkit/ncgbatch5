package exceptionhandling;

public class NoNonVegAvailableException extends RuntimeException{
    String message;
    NoNonVegAvailableException(){

    }
    NoNonVegAvailableException(String msg){
        super(msg);
        message = msg;
    }
}











