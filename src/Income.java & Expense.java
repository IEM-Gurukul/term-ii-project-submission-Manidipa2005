// Income subclass
class Income extends Transaction {
    public Income(String desc, double amt, String date) { super(desc, amt, date); }
    
    @Override
    public double getEffectOnBalance() { return amount; }
}

// Expense subclass
class Expense extends Transaction {
    public Expense(String desc, double amt, String date) { super(desc, amt, date); }

    @Override
    public double getEffectOnBalance() { return -amount; }
}
