class WThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        try {
            S.k.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        } 

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class S {
    static Thread k;
    // main method 
    public static void main(String[] args) {
        WThread x = new WThread();
        x.setName("abc");
        x.start();

        k = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(k.getName() + " - " + i);
        }
    }
}
/*OUTPUT:
D:\javaprac\35_Multi_Threading>java S
main - 0
main - 1
main - 2
main - 3
main - 4
main - 5
main - 6
main - 7
main - 8
main - 9
main - 10
main - 11
main - 12
main - 13
main - 14
main - 15
main - 16
main - 17
main - 18
main - 19
main - 20
main - 21
main - 22
main - 23
main - 24
main - 25
main - 26
main - 27
main - 28
main - 29
abc - 0
abc - 1
abc - 2
abc - 3
abc - 4
abc - 5
abc - 6
abc - 7
abc - 8
abc - 9
abc - 10
abc - 11
abc - 12
abc - 13
abc - 14
abc - 15
abc - 16
abc - 17
abc - 18
abc - 19
abc - 20
abc - 21
abc - 22
abc - 23
abc - 24
abc - 25
abc - 26
abc - 27
abc - 28
abc - 29
 */