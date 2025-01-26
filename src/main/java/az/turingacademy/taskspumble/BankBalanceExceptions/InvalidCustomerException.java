package az.turingacademy.taskspumble.BankBalanceExceptions;

public class InvalidCustomerException extends Exception{
    public InvalidCustomerException (String message) {
        super(message);
    }
}
