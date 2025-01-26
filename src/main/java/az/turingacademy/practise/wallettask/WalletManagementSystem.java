package az.turingacademy.practise.wallettask;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WalletManagementSystem {
    public static void main(String[] args) {

        User famil1 = new User("Famil1", "Wallet1", "Mail");
        User famil2 = new User("Famil2", "Wallet2", "Mail2");

        Wallet walletF = new Wallet ("Famil", 0.0, famil1.getUserId());
        Wallet walletF2 = new Wallet("Famil2", 0.0, famil2.getUserId());

        List<Transaction> transactions = new ArrayList<>();

        walletF.deposit(1000.0);
        transactions.add(new Transaction(1000.0, new Date(), famil2.getUserId(), "Deposit"));

        if (walletF.withdraw(200.0)) {
            walletF2.deposit(200.0);
            transactions.add(new Transaction(200.0, new Date(), famil1.getUserId(), famil2.getUserId(), "Transfer"));
        }

        walletF.withdraw(300.0);
        transactions.add(new Transaction(300.0, new Date(), famil1.getUserId(), "Withdraw"));

        System.out.println("Transaction log: ");
        for (Transaction transaction: transactions) {
            System.out.println(transaction);
        }







    }

}
