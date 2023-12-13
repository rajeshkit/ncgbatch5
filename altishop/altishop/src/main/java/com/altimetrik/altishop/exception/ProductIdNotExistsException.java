package com.altimetrik.altishop.exception;

public class ProductIdNotExistsException extends Exception {
    String msg;
    public ProductIdNotExistsException(){
        super();
    }
    public ProductIdNotExistsException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
