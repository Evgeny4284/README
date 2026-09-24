public abstract class Account {

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            }
            add(amount); // откат, если принять деньги не удалось
        }
        return false;
    }

    public abstract long getBalance();
}
