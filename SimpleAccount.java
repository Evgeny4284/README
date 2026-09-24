public class SimpleAccount extends Account {

    private long balance;

    @Override
    public boolean add(long amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0 || balance < amount) {
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
