class Y {
    static void pro(Integer... x) {
        //iterating var_args of type Integer through Enhanced for-loop.
        for(Integer nx : x)
            System.out.print(nx + " $");
    }

    static void pro(int... x) {
        //iterating var_args of primitive type int through Enhanced for-loop.
        for(int next : x) 
            System.out.println(next + " *");
    }

    //main method
    public static void main(String[] args) {
        pro(45, 67, 89);
    }
}
/*OUTPUT:kyuki humne method calling m direct array bana k pass kr dia h to compiler confuse ho jayega ki m
         compiler internally array of wrapper class Integer create kru ya array of primitive type int create kru
         kyuki method dono versions m available h,to abmiguity situation occur hogi.or compilation fail ho jayega.

         D:\javaprac\47_var_args>javac Y.java
Y.java:16: error: reference to pro is ambiguous
        pro(45, 67, 89);
        ^
  both method pro(Integer...) in Y and method pro(int...) in Y match
1 error
*/