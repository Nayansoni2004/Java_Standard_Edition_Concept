class Y1 {
    //instance-level var.
    private int x = 99; //parent class ka instance var.
    //instance-level method
    void pro() {
        System.out.println(x);
        abc();
    }
    //instance-level method
    private void abc() {
        System.out.println("Hi");
    }
}

class I extends Y1 {
    //instance-level var.
    int x = 66; //child class ka instance var.
    //instance-level method
    void pro() {
        int x = 22; //local var.

        System.out.println(x);
        System.out.println(this.x);
        //System.out.println(super.x); error: x has private access in Y1
        pro();   //recursive call of pro method at line no.25 
        //abc();  error: cannot find symbol
    }
    //main method
    public static void main(String[] args) {
        I i = new I();
        i.pro();
    }
}
/* Exception occur at runtime...due to recursion of pro method at line no.25!!!
 Exception in thread "main" java.lang.StackOverflowError
        at java.base/java.nio.CharBuffer.wrap(CharBuffer.java:408)
        at java.base/sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:281)
        at java.base/sun.nio.cs.StreamEncoder.write(StreamEncoder.java:132)
        at java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
        at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:120)
        at java.base/java.io.PrintStream.writeln(PrintStream.java:722)
        at java.base/java.io.PrintStream.println(PrintStream.java:938)   */