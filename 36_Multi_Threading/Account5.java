class Account5 {
    private int balance = 50;

    public void withdraw(int amt) {
        synchronized(this) {
            if(balance >= amt) {
                try { Thread.sleep(500); } 
                catch(InterruptedException e) { e.printStackTrace(); }
                balance = balance - amt;
            }
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}
