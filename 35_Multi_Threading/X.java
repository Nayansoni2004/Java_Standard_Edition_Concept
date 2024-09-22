class CRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0 ; i < 30 ; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class X {
    //main method
    public static void main(String[] args) {
        //Trick: 1
       // Thread x = new Thread(new CRunnable()); 
       // x.setName("yamraj");
       // x.start();

       //or
       //Trick: 2 
      // Thread x = new Thread(new CRunnable() , "yamraj");
      // x.start();

      //or
      //Trick: 3
      new Thread(new CRunnable() ,"yamraj").start();

      Thread t = Thread.currentThread();

      for(int i = 0 ; i < 30 ; i++) {
        if(i > 15) 
            Thread.yield();

        System.out.println(t.getName() + " - " + i);
      }
    }    
}
/*OUTPUT: jaise hi i ki value greater than 15 ho gyi main thread kuch der k liye hold m chala gya,or yamaraj ki
kuch cycle chali than main thread hold se running m aya or main ka execution wapis resume ho gya.

D:\javaprac\35_Multi_Threading>java X
main - 0
main - 1
main - 2
yamraj - 0
main - 3
main - 4
main - 5
main - 6
main - 7
yamraj - 1
yamraj - 2
main - 8
main - 9
yamraj - 3
yamraj - 4
main - 10
yamraj - 5
yamraj - 6
main - 11
main - 12
yamraj - 7
yamraj - 8
yamraj - 9
main - 13
yamraj - 10
main - 14
yamraj - 11
yamraj - 12
yamraj - 13
yamraj - 14
main - 15
yamraj - 15
main - 16
yamraj - 16
yamraj - 17
yamraj - 18
main - 17
main - 18
yamraj - 19
main - 19
yamraj - 20
main - 20
yamraj - 21
yamraj - 22
main - 21
yamraj - 23
yamraj - 24
main - 22
main - 23
main - 24
yamraj - 25
yamraj - 26
main - 25
yamraj - 27
yamraj - 28
main - 26
yamraj - 29
main - 27
main - 28
main - 29

D:\javaprac\35_Multi_Threading>java X
yamraj - 0
yamraj - 1
main - 0
main - 1
main - 2
main - 3
main - 4
yamraj - 2
yamraj - 3
yamraj - 4
yamraj - 5
main - 5
main - 6
yamraj - 6
yamraj - 7
yamraj - 8
main - 7
main - 8
yamraj - 9
yamraj - 10
main - 9
main - 10
main - 11
main - 12
yamraj - 11
yamraj - 12
main - 13
main - 14
yamraj - 13
yamraj - 14
main - 15
yamraj - 15
yamraj - 16
main - 16
yamraj - 17
yamraj - 18
main - 17
yamraj - 19
yamraj - 20
yamraj - 21
main - 18
main - 19
yamraj - 22
yamraj - 23
yamraj - 24
yamraj - 25
yamraj - 26
main - 20
main - 21
yamraj - 27
yamraj - 28
main - 22
yamraj - 29
main - 23
main - 24
main - 25
main - 26
main - 27
main - 28
main - 29
 */