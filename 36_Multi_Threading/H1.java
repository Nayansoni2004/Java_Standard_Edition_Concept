class Transaction3 implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println(x.getName() + " is going to withdraw Rs 10");
            H1.ac.withdraw(10);
            System.out.println(x.getName() + " after withdrawal... the balance is Rs " + H1.ac.getBalance());
        }
    }
}
class H1 {
    static Account6 ac = new Account6();
    //main method
    public static void main(String[] args) {
        Transaction3 t = new Transaction3();
        Thread a = new Thread(t , "Prayank");
        Thread b = new Thread(t , "Anshul");

        a.start();
        b.start();
    }  
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java H1
Anshul is going to withdraw Rs 10
Prayank is going to withdraw Rs 10
Anshul after withdrawal... the balance is Rs 40
Anshul is going to withdraw Rs 10
Prayank after withdrawal... the balance is Rs 30
Prayank is going to withdraw Rs 10
Anshul after withdrawal... the balance is Rs 20
Anshul is going to withdraw Rs 10
Prayank after withdrawal... the balance is Rs 10
Prayank is going to withdraw Rs 10
Prayank after withdrawal... the balance is Rs 0
Prayank is going to withdraw Rs 10
Anshul after withdrawal... the balance is Rs 0
Anshul is going to withdraw Rs 10
Anshul after withdrawal... the balance is Rs 0
Prayank after withdrawal... the balance is Rs 0
Prayank is going to withdraw Rs 10
Prayank after withdrawal... the balance is Rs 0
Anshul is going to withdraw Rs 10
Anshul after withdrawal... the balance is Rs 0
 */