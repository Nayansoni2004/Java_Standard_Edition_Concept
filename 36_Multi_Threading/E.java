class Transaction implements Runnable {  
    public void run() { 
        Thread x = Thread.currentThread();
        for(int i = 0 ; i < 5 ; i++) {
            if(E.ac.getBalance() >= 10) {
                System.out.println(x.getName() + " is going to withdraw Rs 10");
                try{ Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); }
                E.ac.withdraw(10);
                System.out.println(x.getName() + " after withdrawal.. the balance is Rs " + E.ac.getBalance());
            }
        }
    }
}
class E {
    static Account2 ac = new Account2();  
    //main method
    public static void main(String[] args) {  
        Transaction t = new Transaction();
        Thread a = new Thread(t , "mohan");   
        Thread b = new Thread(t , "sohan");
        a.start();
        b.start();
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java E
sohan is going to withdraw Rs 10
mohan is going to withdraw Rs 10
sohan after withdrawal.. the balance is Rs 40
sohan is going to withdraw Rs 10
mohan after withdrawal.. the balance is Rs 30
mohan is going to withdraw Rs 10
mohan after withdrawal.. the balance is Rs 20
sohan after withdrawal.. the balance is Rs 10
sohan is going to withdraw Rs 10
mohan is going to withdraw Rs 10
mohan after withdrawal.. the balance is Rs 0
sohan after withdrawal.. the balance is Rs -10
 */