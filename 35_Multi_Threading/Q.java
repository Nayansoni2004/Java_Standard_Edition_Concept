class NThread extends Thread {
    public void run() throws InterruptedException { 
        Thread.sleep(3000);
        String name = Thread.currentThread().getName();
        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(name + " - " + i);
        }
    }
}

class Q {
    // main method
    public static void main(String[] args) {
        NThread x = new NThread();
        x.setName("Raju");
        x.start();

        String name = Thread.currentThread().getName();
        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(name + " - " + i);
        }
    }
}
/*OUTPUT: error aai kyuki parent class Thread m run() method kisi tarah ka exception throws nhi krti h,matlab 
overridden method koi exception throws nhi krti h to overriding method bhi kisi tarah ka naya exception throws 
nhi kr sakti,acc. to rule NEWER exception is not Allowed.
 
D:\javaprac\35_Multi_Threading>javac Q.java
Q.java:2: error: run() in NThread cannot implement run() in Runnable
    public void run() throws InterruptedException {
                ^
  overridden method does not throw InterruptedException
1 error
 */