public class CreditAccount extends Account {

    private long balance;
    private final long creditLimit;

    public CreditAccount(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount <= 0 || balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0 || balance - amount < -creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public long getBalance() {
        return balance;
    }
}
