class XThread extends Thread {
    public void run() {
        System.out.println("Thread Id: " + getId());
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
    }
}

class D {
    //main method
    public static void main(String[] args) {
        XThread x = new XThread();
        x.start();
        System.out.println("Default Thread main method");
    }    
}
/*OUPUT:
Default Thread main method
Thread Id: 15
Thread Name: Thread-0
Thread Priority: 5
 */