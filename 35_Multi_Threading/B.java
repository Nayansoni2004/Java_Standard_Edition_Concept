class AThread extends Thread {
    public void run() {
        B.aaa();
    }
}

class BThread extends Thread {
    public void run() {
        B.bbb();
    }
}

class CThread extends Thread {
    public void run() {
        B.ccc();
    }
}

class B {
    static void aaa() {
        for(int i=0 ; i<30 ; i++) {
            System.out.println("aaa()" + i);
        }
    }

    static void bbb() {
        for(int i=0 ; i<30 ; i++) {
            System.out.println("bbb()" + i);
        }
    }

    static void ccc() {
        for(int i=0 ; i<30 ; i++) {
            System.out.println("ccc()" + i);
        }
    }
    // main method
    public static void main(String[] args) {
        AThread x = new AThread();
        x.start();
        BThread y = new BThread();
        y.start();
        CThread z = new CThread();
        z.start();
    }      
}
/*OUTPUT:happily compiled & runned...but har bar run krne pr kabhi ccc() last m end ho rha h,Kabhi aaa() or kabhi
 bbb(),aisa isley ho rha h kuyki start() call krne pr new Thread ban jata h or fir run() method Default thread pr
 run hone ki wajah us new Thread pr run hone lagta h,to start() ne 3 new Thread banaye h jinke names "Thread-0" 
"Thread-1" or "Thread-2" bydefalut set ho jayenge kyuki hum ne explicitely koi name nhi dia h,or PROCESS SCHEDULAR
teeno Threads of fair turn taking dega to kabhi aaa() ko run hone ka chance milega ,kabhi bbb() ko or Kabhi ccc()
ko but at last sub apna job khatam krenge.
 */