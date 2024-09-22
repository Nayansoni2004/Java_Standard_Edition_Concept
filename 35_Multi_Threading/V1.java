//NOT a DEADLOCK Condition. kyuki golu or bablu ne 20milli seconds k liye 1 dushre ko join kia h or 20milliseconds
//dono k khatam hone k baad schedular kabhi golu thread ko run hone ka chance dega kabhi bablu thread ko chance 
//milega.
class D1Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        try { V1.y.join(20); } 
        catch(InterruptedException e) { e.printStackTrace();}

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class D2Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        try { V1.x.join(20);}
        catch(InterruptedException e) { e.printStackTrace(); }

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class V1 {
    static Thread x;
    static Thread y;
    //main method
    public static void main(String[] args) {
        x = new D1Thread();
        y = new D2Thread();

        x.setName("golu");
        y.setName("bablu");

        x.start();
        y.start();
    }    
}
/*OUTPUT: not a DEADLOCK(never ending)Condition.
D:\javaprac\35_Multi_Threading>java V1
golu - 0
golu - 1
golu - 2
bablu - 0
bablu - 1
bablu - 2
golu - 3
golu - 4
bablu - 3
bablu - 4
bablu - 5
bablu - 6
golu - 5
golu - 6
bablu - 7
bablu - 8
golu - 7
golu - 8
bablu - 9
bablu - 10
bablu - 11
golu - 9
golu - 10
golu - 11
golu - 12
bablu - 12
bablu - 13
golu - 13
golu - 14
golu - 15
bablu - 14
bablu - 15
golu - 16
golu - 17
bablu - 16
bablu - 17
bablu - 18
bablu - 19
bablu - 20
bablu - 21
golu - 18
golu - 19
golu - 20
bablu - 22
bablu - 23
bablu - 24
bablu - 25
bablu - 26
bablu - 27
bablu - 28
golu - 21
golu - 22
golu - 23
golu - 24
golu - 25
bablu - 29
golu - 26
golu - 27
golu - 28
golu - 29
 */