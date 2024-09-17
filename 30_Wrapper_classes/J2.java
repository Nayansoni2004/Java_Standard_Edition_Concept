class J2 {
    //main method
    public static void main(String[] args) {
        Integer a = new Integer(2);
        Integer b = new Integer(2);
        Integer c = new Integer(2);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(a));
    }    
}
/*OUTPUT:
J2.java:4: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
        Integer a = new Integer(2);
                    ^
J2.java:5: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
        Integer b = new Integer(2);
                    ^
J2.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
        Integer c = new Integer(2);
                    ^
3 warnings

D:\javaprac\30_Wrapper_classes>java J2
false
false
false
~~~~~~~~~~~~~~~~
true
true
true
*/