class MyThread extends Thread {
    public void run() {
        System.out.println("My Thread run method");
    }
}

class C {
    //main method
    public static void main(String[] args) {
        MyThread x = new MyThread();
        x.start();
        System.out.println("Default Thread main method");
    }    
}
/*OUTPUT:
Default Thread main method
My Thread run method
 */