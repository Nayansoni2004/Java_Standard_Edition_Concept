class GThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(name + " - " + i);
        }
    }
}

class P {
    // main method
    public static void main(String[] args) {
        GThread x = new GThread();
        x.setName("Raju");
        x.start();

        try {
            x.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        String name = Thread.currentThread().getName();
        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(name + " - " + i);
        }
    }
}
/*OUTPUT:
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