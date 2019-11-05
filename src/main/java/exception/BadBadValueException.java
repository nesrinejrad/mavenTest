package exception;

public class BadBadValueException extends RuntimeException {

    public BadBadValueException(){
        super();
        System.out.println("Duration must not be negative");
        }
        }
