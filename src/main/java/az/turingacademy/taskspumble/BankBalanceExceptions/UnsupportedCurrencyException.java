package az.turingacademy.taskspumble.BankBalanceExceptions;

public class UnsupportedCurrencyException extends Exception{
    public UnsupportedCurrencyException (String message) {
        super(message);
    }
}
