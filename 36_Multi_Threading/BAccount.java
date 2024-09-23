class BAccount {
    private int balance = 50;  //consistently accessed property

    public synchronized void withdraw(int amt) { //acquire object lock...
        if(balance >= amt) {
            try { Thread.sleep(500); } //used try & catch block to feel human touch operations(i.e,pause)
            catch(InterruptedException e) { e.printStackTrace(); } 
            balance = balance - amt; //update property.
        }
    }

    public synchronized int getBalance() { //acquire object lock...
        return balance;
    }
}
