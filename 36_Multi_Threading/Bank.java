//Refined-Implementation of BANK MANAGEMENT where two account user come online for transaction at same time and 
//their Bank account is same.(i.e. one account->two account holders).
class Transactions implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println(x.getName() + " is going to withdraw Rs 10");
            Bank.ac.withdraw(10);
            System.out.println(x.getName() + " after withdrawal.. the balance is Rs " + Bank.ac.getBalance());
        }
    }
}
class Bank{
    static BAccount ac = new BAccount(); //(single account object)
    // main method->Execution starting point.
    public static void main(String[] args) {  
        Transactions t = new Transactions(); 
        Thread a = new Thread(t , "USER1"); //Thread-1(Acc.User)
        Thread b = new Thread(t , "USER2"); //Thread-2(Acc.User)
        a.start(); 
        b.start();
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Bank
USER1 is going to withdraw Rs 10
USER2 is going to withdraw Rs 10
USER1 after withdrawal.. the balance is Rs 40
USER1 is going to withdraw Rs 10
USER2 after withdrawal.. the balance is Rs 30
USER2 is going to withdraw Rs 10
USER1 after withdrawal.. the balance is Rs 20
USER1 is going to withdraw Rs 10
USER2 after withdrawal.. the balance is Rs 10
USER2 is going to withdraw Rs 10
USER2 after withdrawal.. the balance is Rs 0
USER2 is going to withdraw Rs 10
USER2 after withdrawal.. the balance is Rs 0
USER1 after withdrawal.. the balance is Rs 0
USER1 is going to withdraw Rs 10
USER2 is going to withdraw Rs 10
USER1 after withdrawal.. the balance is Rs 0
USER1 is going to withdraw Rs 10
USER1 after withdrawal.. the balance is Rs 0
USER2 after withdrawal.. the balance is Rs 0
 */