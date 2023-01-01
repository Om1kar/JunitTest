package com.bridgelabz.exception;

public class InvalidPasswordException extends Throwable {
    public InvalidPasswordException() {
        super();
    }

    public InvalidPasswordException(String message) {
        super(message);
    }
}
