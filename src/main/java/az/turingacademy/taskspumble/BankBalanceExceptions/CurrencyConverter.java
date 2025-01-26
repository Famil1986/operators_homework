package az.turingacademy.taskspumble.BankBalanceExceptions;

public class CurrencyConverter {

    public double convert(double amount, String fromCurrency, String toCurrency) throws UnsupportedCurrencyException {
        if (!isSupportedCurrency(fromCurrency) || !isSupportedCurrency(toCurrency)) {
            throw new UnsupportedCurrencyException("Bu valyuta dəstəklənmir!");
        }
        return amount;
    }

    private boolean isSupportedCurrency(String fromCurrency) {
        return Currency.USD.equals("USD") || Currency.EUR.equals("EUR") || Currency.AZN.equals("AZN");
    }
}
