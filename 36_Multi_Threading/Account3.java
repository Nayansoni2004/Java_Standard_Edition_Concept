class Account3 {
    private int balance = 50;  //consistently accessed property

    public synchronized void withdraw(int amt) { //acquire object lock...
        if(balance >= amt) {
            try { Thread.sleep(500); } 
            catch(InterruptedException e) { e.printStackTrace(); } 
            balance = balance - amt;
        }
    }

    public synchronized int getBalance() { //acquire object lock...
        return balance;
    }
}
