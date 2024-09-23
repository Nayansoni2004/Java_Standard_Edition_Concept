//Refined-Implementation of Atm machine where two account holder comes online for transaction at same time and 
//account is same.(i.e. one account->two account holders).
class Transaction implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println(x.getName() + " is going to withdraw Rs 10");
            F.ac.withdraw(10);
            System.out.println(x.getName() + " after withdrawal.. the balance is Rs " + F.ac.getBalance());
        }
    }
}
class F {
    static Account3 ac = new Account3();
    // main method->Execution starting point.
    public static void main(String[] args) {  
        Transaction t = new Transaction(); 
        Thread a = new Thread(t , "mohan"); //Thread-1
        Thread b = new Thread(t , "sohan"); //Thread-2

        a.start();
        b.start();
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java F
sohan is going to withdraw Rs 10
mohan is going to withdraw Rs 10
sohan after withdrawal.. the balance is Rs 40
sohan is going to withdraw Rs 10
mohan after withdrawal.. the balance is Rs 30
mohan is going to withdraw Rs 10
sohan after withdrawal.. the balance is Rs 20
sohan is going to withdraw Rs 10
mohan after withdrawal.. the balance is Rs 10
mohan is going to withdraw Rs 10
sohan after withdrawal.. the balance is Rs 0
mohan after withdrawal.. the balance is Rs 0
mohan is going to withdraw Rs 10
mohan after withdrawal.. the balance is Rs 0
mohan is going to withdraw Rs 10
sohan is going to withdraw Rs 10
sohan after withdrawal.. the balance is Rs 0
sohan is going to withdraw Rs 10
sohan after withdrawal.. the balance is Rs 0
mohan after withdrawal.. the balance is Rs 0
 */