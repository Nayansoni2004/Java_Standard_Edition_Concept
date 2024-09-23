class Account2 {
    private int balance = 50;

    public synchronized void withdraw(int amt) {
        balance = balance - amt;
    }

    public synchronized int getBalance() {
        return balance;
    }
}
