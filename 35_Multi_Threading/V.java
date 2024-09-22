//Example of DEADLOCK Condition.
class C1Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        try { V.y.join(); } 
        catch(InterruptedException e) { e.printStackTrace();}

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class C2Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        try { V.x.join();}
        catch(InterruptedException e) { e.printStackTrace(); }

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class V {
    static Thread x;
    static Thread y;
    //main method
    public static void main(String[] args) {
        x = new C1Thread();
        y = new C2Thread();

        x.setName("golu");
        y.setName("bablu");

        x.start();
        y.start();
    }    
}
/*OUTPUT: kuch print nhi hoga ...DEADLOCK(never ending) condition. ctrl c click kr k execution stop krna padega.

D:\javaprac\35_Multi_Threading>javac V.java

D:\javaprac\35_Multi_Threading>java V
^C
D:\javaprac\35_Multi_Threading>java V
^C
 */