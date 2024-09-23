class A1Runnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class A1 {
    //main method
    public static void main(String[] args) {
        Thread x = new Thread(new A1Runnable() , "yamraj");

        x.setPriority(Thread.MIN_PRIORITY);

        System.out.println(Thread.currentThread().getName());
    }
}
//OUTPUT: main