class K2 {
    //main method
    public static void main(String[] args) {
        Long a = new Long(2L);
        Long b = new Long(2L);
        Long c = new Long(2L);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == a);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(a));
    }
}
/*OUTPUT:
K2.java:4: warning: [removal] Long(long) in Long has been deprecated and marked for removal
        Long a = new Long(2L);
                 ^
K2.java:5: warning: [removal] Long(long) in Long has been deprecated and marked for removal
        Long b = new Long(2L);
                 ^
K2.java:6: warning: [removal] Long(long) in Long has been deprecated and marked for removal
        Long c = new Long(2L);
                 ^
3 warnings

D:\javaprac\30_Wrapper_classes>java K2
false
false
false
~~~~~~~~~~~~~~~~~~
true
true
true
*/