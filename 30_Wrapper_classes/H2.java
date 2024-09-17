class H2 {
    //main method
    public static void main(String[] args) {
        Byte a = new Byte((byte)2);
        Byte b = new Byte((byte)2);
        Byte c = new Byte((byte)2);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));
    } 
}
/* OUTPUT:
H2.java:4: warning: [removal] Byte(byte) in Byte has been deprecated and marked for removal
        Byte a = new Byte((byte)2);
                 ^
H2.java:5: warning: [removal] Byte(byte) in Byte has been deprecated and marked for removal
        Byte b = new Byte((byte)2);
                 ^
H2.java:6: warning: [removal] Byte(byte) in Byte has been deprecated and marked for removal
        Byte c = new Byte((byte)2);
                 ^
3 warnings

D:\javaprac\30_Wrapper_classes>java H2
false
false
false
~~~~~~~~~~~~~~~~~~
true
true
true
*/