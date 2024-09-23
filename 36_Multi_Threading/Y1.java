/*Concept:is example m hum ne apna khud ka ThreadGroup banaya h,jiska name QUAD set kia h, or us k andar humne
          4 thread of execution banaye h,ye charo thread of execution QUAD ThreadGroup k andar bane h,jinki list
          hum print kr rhe h.*/
class Y1 {
    //main method
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("QUAD");
        Thread t1 = new Thread(tg , new XRunnable() , "Bharat"); //thread=1 of ThreadGroup:QUAD
        Thread t2 = new Thread(tg , new XRunnable() , "US"); //thread=2 of ThreadGroup:QUAD
        Thread t3 = new Thread(tg , new XRunnable() , "Australia"); //thread=3 of ThreadGroup:QUAD
        Thread t4 = new Thread(tg , new XRunnable() , "Japan"); //thread=4 of ThreadGroup:QUAD

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(tg.getName() + "'s Child threads: ");
        tg.list(); //ThreadGroup class ki instance level method h,return-type:void.
    }
}
class XRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
/*OUTPUT:
D:\javaprac\36_Multi_Threading>java Y1
QUAD's Child threads:
java.lang.ThreadGroup[name=QUAD,maxpri=10]
    Thread[Bharat,5,QUAD]
    Thread[US,5,QUAD]
    Thread[Australia,5,QUAD]
    Thread[Japan,5,QUAD]
US - 0
Bharat - 0
Australia - 0
Japan - 0
Bharat - 1
US - 1
Bharat - 2
Bharat - 3
Bharat - 4
Bharat - 5
Japan - 1
Australia - 1
Japan - 2
Japan - 3
Japan - 4
Bharat - 6
Bharat - 7
Bharat - 8
Bharat - 9
US - 2
Bharat - 10
Japan - 5
Australia - 2
Australia - 3
Japan - 6
Bharat - 11
US - 3
Bharat - 12
Japan - 7
Australia - 4
Japan - 8
Bharat - 13
US - 4
Bharat - 14
Bharat - 15
Bharat - 16
Japan - 9
Australia - 5
Japan - 10
Bharat - 17
Bharat - 18
US - 5
Bharat - 19
Bharat - 20
Bharat - 21
Japan - 11
Australia - 6
Japan - 12
Bharat - 22
US - 6
Bharat - 23
Japan - 13
Australia - 7
Japan - 14
Bharat - 24
US - 7
Bharat - 25
Bharat - 26
Japan - 15
Japan - 16
Japan - 17
Australia - 8
Australia - 9
Japan - 18
Bharat - 27
Bharat - 28
Bharat - 29
US - 8
Japan - 19
Australia - 10
Australia - 11
Australia - 12
Japan - 20
Japan - 21
Japan - 22
Japan - 23
Japan - 24
US - 9
US - 10
US - 11
US - 12
US - 13
US - 14
Japan - 25
Japan - 26
Japan - 27
Australia - 13
Australia - 14
Australia - 15
Japan - 28
US - 15
US - 16
US - 17
US - 18
US - 19
Japan - 29
Australia - 16
Australia - 17
Australia - 18
US - 20
US - 21
US - 22
Australia - 19
US - 23
Australia - 20
Australia - 21
Australia - 22
Australia - 23
Australia - 24
Australia - 25
US - 24
Australia - 26
Australia - 27
Australia - 28
Australia - 29
US - 25
US - 26
US - 27
US - 28
US - 29 */