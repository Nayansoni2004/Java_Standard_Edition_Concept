class M2 {
    //main method
    public static void main(String[] args) {
        Double a = new Double(2.3);
        Double b = new Double(2.3);
        Double c = new Double(2.3);

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
M2.java:4: warning: [removal] Double(double) in Double has been deprecated and marked for removal
        Double a = new Double(2.3);
                   ^
M2.java:5: warning: [removal] Double(double) in Double has been deprecated and marked for removal
        Double b = new Double(2.3);
                   ^
M2.java:6: warning: [removal] Double(double) in Double has been deprecated and marked for removal
        Double c = new Double(2.3);
                   ^
3 warnings

D:\javaprac\30_Wrapper_classes>java M2
false
false
false
~~~~~~~~~~~~~~~~~~~~~~
true
true
true
*/