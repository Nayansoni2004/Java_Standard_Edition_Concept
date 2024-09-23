class Account6 {
    private int balance = 50;
//Account5 m withdraw() aam method tha Account6 m withdraw() synchronized h.
    public synchronized void withdraw(int amt) {
        synchronized(this) { //this likhne se koi farq nhi padega kyuki method snchronized h isley thread already lock leke baitha h.
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
