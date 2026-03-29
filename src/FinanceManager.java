import java.util.ArrayList;
import java.util.List;

public class FinanceManager {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void showHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        transactions.forEach(System.out::println);
    }

    public double calculateBalance() {
        double balance = 0;
        for (Transaction t : transactions) {
            balance += t.getEffectOnBalance(); // Polymorphic call
        }
        return balance;
    }

    public List<Transaction> getTransactions() { return transactions; }
}
