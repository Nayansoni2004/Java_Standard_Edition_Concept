class A1Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class A2Thread extends Thread {
    public void run() {
        A3Thread x = new A3Thread();
        x.setName("kaliya");
        x.start();

        try {
            x.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        Thread t = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class A3Thread extends Thread {
    public void run() {
        A1Thread x = new A1Thread();
        x.setName("chotaBheem");
        x.start();

        try {
            x.join(); 
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        Thread t = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class T {
    // main method
    public static void main(String[] args) {
        A2Thread x = new A2Thread();
        x.setName("Raju");
        x.start();

        try {
            x.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        } 

        Thread t = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
/*OUTPUT:
D:\javaprac\35_Multi_Threading>java T
chotaBheem - 0
chotaBheem - 1
chotaBheem - 2
chotaBheem - 3
chotaBheem - 4
chotaBheem - 5
chotaBheem - 6
chotaBheem - 7
chotaBheem - 8
chotaBheem - 9
chotaBheem - 10
chotaBheem - 11
chotaBheem - 12
chotaBheem - 13
chotaBheem - 14
chotaBheem - 15
chotaBheem - 16
chotaBheem - 17
chotaBheem - 18
chotaBheem - 19
chotaBheem - 20
chotaBheem - 21
chotaBheem - 22
chotaBheem - 23
chotaBheem - 24
chotaBheem - 25
chotaBheem - 26
chotaBheem - 27
chotaBheem - 28
chotaBheem - 29
kaliya - 0
kaliya - 1
kaliya - 2
kaliya - 3
kaliya - 4
kaliya - 5
kaliya - 6
kaliya - 7
kaliya - 8
kaliya - 9
kaliya - 10
kaliya - 11
kaliya - 12
kaliya - 13
kaliya - 14
kaliya - 15
kaliya - 16
kaliya - 17
kaliya - 18
kaliya - 19
kaliya - 20
kaliya - 21
kaliya - 22
kaliya - 23
kaliya - 24
kaliya - 25
kaliya - 26
kaliya - 27
kaliya - 28
kaliya - 29
Raju - 0
Raju - 1
Raju - 2
Raju - 3
Raju - 4
Raju - 5
Raju - 6
Raju - 7
Raju - 8
Raju - 9
Raju - 10
Raju - 11
Raju - 12
Raju - 13
Raju - 14
Raju - 15
Raju - 16
Raju - 17
Raju - 18
Raju - 19
Raju - 20
Raju - 21
Raju - 22
Raju - 23
Raju - 24
Raju - 25
Raju - 26
Raju - 27
Raju - 28
Raju - 29
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
 */