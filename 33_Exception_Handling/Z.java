class Z {
    //main method
    public static void main(String[] args) {
        
        Thread x = new Thread();

        x.start();
        // x.stop();
    }
}
/*OUTPUT: start(); method ko 1 bar call kre to happily compiled & runed lekin agar 2 bar call kre to Exception
          aayega,that we will see in Z1.java example.
 */