class F {
    //main method
    public static void main(String[] args) {
        Boolean a = new Boolean(true);
        Boolean b = new Boolean(true);
        Boolean c = new Boolean(true);
        //a b c var. k reference code ka comparison ho rha h...
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        //a b c var. k through object m rakhi values ka comparison ho rha h...
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));
    }
}
/*OUTPUT:
F.java:4: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
        Boolean a = new Boolean(true);
                    ^
F.java:5: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
        Boolean b = new Boolean(true);
                    ^
F.java:6: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
        Boolean c = new Boolean(true);
                    ^
3 warnings

D:\javaprac\30_Wrapper_classes>java F
false
false
false
~~~~~~~~~~~~~~~~~~~~~~~~
true
true
true
*/