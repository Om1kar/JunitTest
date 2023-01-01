package com.bridgelabz.exception;

public class InvalidEMailException extends Throwable {
    public InvalidEMailException() {
        super();
    }

    public InvalidEMailException(String message) {
        super(message);
    }
}
