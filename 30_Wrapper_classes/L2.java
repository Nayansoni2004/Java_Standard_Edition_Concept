class L2 {
    //main method
    public static void main(String[] args) {
        Float a = new Float(2.3f);
        Float b = new Float(2.3f);
        Float c = new Float(2.3f);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == a);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(a));
    }  
}
/*OUTPUT:
D:\javaprac\30_Wrapper_classes>javac L2.java
L2.java:4: warning: [removal] Float(float) in Float has been deprecated and marked for removal
        Float a = new Float(2.3f);
                  ^
L2.java:5: warning: [removal] Float(float) in Float has been deprecated and marked for removal
        Float b = new Float(2.3f);
                  ^
L2.java:6: warning: [removal] Float(float) in Float has been deprecated and marked for removal
        Float c = new Float(2.3f);
                  ^
3 warnings

D:\javaprac\30_Wrapper_classes>java L2
false
false
false
~~~~~~~~~~~~~~~~~~~~~~
true
true
true
*/
