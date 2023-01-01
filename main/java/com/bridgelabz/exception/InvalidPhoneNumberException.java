package com.bridgelabz.exception;

public class InvalidPhoneNumberException extends Throwable {
    public InvalidPhoneNumberException() {
        super();
    }

    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
