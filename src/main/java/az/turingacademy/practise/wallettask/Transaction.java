package az.turingacademy.practise.wallettask;

import java.util.Date;
import java.util.Objects;

public class Transaction {

    private double amount;
    private Date date;
    private String sourceId;
    private String destinationId;
    private String type;

    public Transaction(double amount, Date date, String sourceId, String destinationId, String type) {
        this.amount = amount;
        this.date = date;
        this.sourceId = sourceId;
        this.destinationId = destinationId;
        this.type = type;
    }

    public Transaction(double amount, Date date, String userId, String type) {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(amount, that.amount) && Objects.equals(date, that.date) && Objects.equals(sourceId, that.sourceId) && Objects.equals(destinationId, that.destinationId) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, date, sourceId, destinationId, type);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", date=" + date +
                ", sourceId=" + sourceId +
                ", destinationId=" + destinationId +
                ", type='" + type + '\'' +
                '}';
    }
}
