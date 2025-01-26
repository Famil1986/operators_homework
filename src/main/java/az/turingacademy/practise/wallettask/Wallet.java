package az.turingacademy.practise.wallettask;

import java.math.BigDecimal;
import java.util.Objects;

public class Wallet {

    private String walletId;
    private double balance;
    private String userId;

    public Wallet (String walletId, double balance, String userId) {
        this.balance = balance;
        this.userId = userId;
        this.walletId = String.valueOf(walletId);
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = String.valueOf(walletId);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = String.valueOf(userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wallet wallet = (Wallet) o;
        return Objects.equals(walletId, wallet.walletId) && Objects.equals(balance, wallet.balance) && Objects.equals(userId, wallet.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(walletId, balance, userId);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "walletId=" + walletId +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void transfer (double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public boolean withdraw (double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else return false;
    }



}

