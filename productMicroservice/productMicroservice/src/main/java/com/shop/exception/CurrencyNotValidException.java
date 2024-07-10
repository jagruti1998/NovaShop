package com.shop.exception;

public class CurrencyNotValidException extends RuntimeException{
    public CurrencyNotValidException(String s){
        super(s);
    }
}
