import java.io.Serializable;

public abstract class Transaction implements Serializable {
    protected String description;
    protected double amount;
    protected String date;

    public Transaction(String description, double amount, String date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    // Abstract method to be implemented by subclasses (Polymorphism)
    public abstract double getEffectOnBalance();

    @Override
    public String toString() {
        return String.format("[%s] %-15s : $%.2f", date, description, amount);
    }
}
