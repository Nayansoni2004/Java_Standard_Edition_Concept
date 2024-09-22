class JThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
    }
}

class N {
    public static void main(String[] args) {
        JThread x = new JThread();

        x.setName("Raju");

        x.start();
    }
}
//OUTPUT: true