class Account4 {
    private int balance = 50;
    private String accType = "savings";
    private String accNum = "4567";
    public String getaccType() {
        return accType;
    }
    public String getaccNum() {
        return accNum;
    }
    public synchronized void withdraw(int amt) {
        Thread x = Thread.currentThread(); //ye likhne se thread,object ka lock leke sleep state m jayega to koi
        // or synchronized method run nhi ho payega kyuki lock jo acquire krega wahi run hoga.
        if(balance >= amt) {
            System.out.println(x.getName() + "~~~~~~~~~~~~~~~~~~~~~~~~~");
            try { Thread.sleep(2000); } catch(InterruptedException e) { e.printStackTrace(); }
            balance = balance - amt;
            System.out.println(x.getName() + "~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    public synchronized int getBalance() {
        return balance;
    }
}
