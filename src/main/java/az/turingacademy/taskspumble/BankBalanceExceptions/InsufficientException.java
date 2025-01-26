package az.turingacademy.taskspumble.BankBalanceExceptions;

public class InsufficientException extends Exception{
    public InsufficientException (String message) {
        super(message);
    }
}
