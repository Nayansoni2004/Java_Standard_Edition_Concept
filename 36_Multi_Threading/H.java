class Transaction implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println(x.getName() + " is going to withdraw Rs 10");
            H.ac.withdraw(10);
            System.out.println(x.getName() + " after withdrawal... the balance is Rs " + H.ac.getBalance());
        }
    }
}
class H {
    static Account5 ac = new Account5();
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
D:\javaprac\36_Multi_Threading>java H
sohan is going to withdraw Rs 10
mohan is going to withdraw Rs 10
sohan after withdrawal... the balance is Rs 40
sohan is going to withdraw Rs 10
mohan after withdrawal... the balance is Rs 30
mohan is going to withdraw Rs 10
sohan after withdrawal... the balance is Rs 20
sohan is going to withdraw Rs 10
mohan after withdrawal... the balance is Rs 10
mohan is going to withdraw Rs 10
sohan after withdrawal... the balance is Rs 0
mohan after withdrawal... the balance is Rs 0
mohan is going to withdraw Rs 10
sohan is going to withdraw Rs 10
sohan after withdrawal... the balance is Rs 0
mohan after withdrawal... the balance is Rs 0
mohan is going to withdraw Rs 10
mohan after withdrawal... the balance is Rs 0
sohan is going to withdraw Rs 10
sohan after withdrawal... the balance is Rs 0
 */