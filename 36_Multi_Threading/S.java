//Producer & Consumer Problem:Solution. 
/* Completely Synced Environment: kyuki pahle producer write krega radius,fir consumer jub tak read nhi kr leta 
   entered radius tab tak producer wapis radius write nhi kr sakta. */
import java.util.Scanner;
class S {
    static Circle c = new Circle();
    //main method
    public static void main(String[] args) {
        Thread t1 = new Thread(new Producer() , "Producer");
        Thread t2 = new Thread(new Consumer() , "Consumer");
        t1.start(); t2.start();
    }
}
class Producer implements Runnable {
    public void run() {
        while(true) { S.c.writeRadius(); }
    }
}
class Consumer implements Runnable {
    public void run() {
        while(true) { S.c.readRadius(); }
    }
}
class Circle {
    private int radius;  //inplicitely assigned by zero.
    static Scanner sc = new Scanner(System.in);/*static mark kia h jis se ki Circle(classObject) m memory 
                                                 allocate ho jayegi,sirf 1 bar.*/
    synchronized void readRadius() {
        if(radius != 0) {
            System.out.println("Consumer->Has read new radius that is: " + radius);
            radius = 0; //read krne k baad 0 se re-initialize kr dena.
            notify();/*producer thread ko notify kr dega ye notify method ki consumer thread ne value read kr li
                       h,ab producer thread lock acquire kr sakte h.*/
        }/*notify() Object class ki instance-level method h,or jub hum <something>.<membername>bina likhe call
           krte h,to wo method kis context m run hogi,ye container method decide krta h,or readRadius non-static
           method h,Circle class k obj. pr run ho rhi hogi,isley notify() method bhi usi Circle obj. pr run hogi.*/
          else {
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); } 
          }   //wait state pe jane pr thread lock leke nhi jata,lock release ho jata h.
    }
    synchronized void writeRadius() {
        if(radius == 0) {
            System.out.print/*ln*/("Producer->Please Reset radius: ");
            radius = sc.nextInt();
            notify(); /*jub producer thread new radius input kr dega,to notify() method Consumer thread ko notify
                        kr dega,ki ab tum lock acquire kr sakte ho.*/
        } else {
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); }
        }  //wait state pe jane pr thread lock leke nhi jata,lock release ho jata h.
    }
}
/*OUTPUT: agar cls enter kia mene to ye output aaya....
D:\javaprac\36_Multi_Threading>java S
Producer-> Enter radius:
cls
Exception in thread "Producer" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at Circle.writeRadius(S.java:42)
        at Producer.run(S.java:14)
        at java.base/java.lang.Thread.run(Thread.java:842)  */
/* OUTPUT:
D:\javaprac\36_Multi_Threading>javac S.java

D:\javaprac\36_Multi_Threading>java S
Producer->Please Reset radius: 2
Consumer->Has read new radius that is: 2
Producer->Please Reset radius: 12
Consumer->Has read new radius that is: 12
Producer->Please Reset radius: 23
Consumer->Has read new radius that is: 23
Producer->Please Reset radius: 100
Consumer->Has read new radius that is: 100
Producer->Please Reset radius: Exception in thread "Producer" ^C      [ctrl+c->Stop]
 */