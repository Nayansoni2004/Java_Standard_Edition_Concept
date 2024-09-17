class I2 {
    //main method
    public static void main(String[] args) {
        Short a = new Short((short)2);
        Short b = new Short((short)2);
        Short c = new Short((short)2);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));
    }    
}
/*OUTPUT:
I2.java:4: warning: [removal] Short(short) in Short has been deprecated and marked for removal
        Short a = new Short((short)2);
                  ^
I2.java:5: warning: [removal] Short(short) in Short has been deprecated and marked for removal
        Short b = new Short((short)2);
                  ^
I2.java:6: warning: [removal] Short(short) in Short has been deprecated and marked for removal
        Short c = new Short((short)2);
                  ^
3 warnings

D:\javaprac\30_Wrapper_classes>java I2
false
false
false
~~~~~~~~~~~~~~~~~~~~
true
true
true
*/