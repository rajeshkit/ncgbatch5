package com.zomoto.exception;

public class NoOrderExistsException extends Exception{
    String msg;
    public NoOrderExistsException(){
    }
    public NoOrderExistsException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
