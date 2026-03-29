import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FinanceManager manager = new FinanceManager();
        Scanner sc = new Scanner(System.in);

        // Thread Concept: Background Greeting/Status
        Thread statusThread = new Thread(() -> {
            try {
                System.out.println("[System] FinTrack Engine Starting...");
                Thread.sleep(1000);
                System.out.println("[System] Ready for input.");
            } catch (InterruptedException e) { e.printStackTrace(); }
        });
        statusThread.start();

        while (true) {
            try {
                System.out.println("\n--- FinTrack Menu ---");
                System.out.println("1. Add Income\n2. Add Expense\n3. View History\n4. View Balance\n5. Exit");
                System.out.print("Choice: ");
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 5) break;

                switch (choice) {
                    case 1:
                    case 2:
                        System.out.print("Description: ");
                        String desc = sc.nextLine();
                        System.out.print("Amount: ");
                        double amt = Double.parseDouble(sc.nextLine());
                        System.out.print("Date (DD-MM): ");
                        String date = sc.nextLine();

                        if (choice == 1) manager.addTransaction(new Income(desc, amt, date));
                        else manager.addTransaction(new Expense(desc, amt, date));
                        break;
                    case 3:
                        manager.showHistory();
                        break;
                    case 4:
                        System.out.println("Current Net Balance: $" + manager.calculateBalance());
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (NumberFormatException e) {
                // Exception Handling for non-numeric input
                System.out.println("Error: Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        System.out.println("Goodbye!");
        sc.close();
    }
}
