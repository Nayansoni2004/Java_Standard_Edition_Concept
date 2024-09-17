class M1 {
    //main method
    public static void main(String[] args) {
        Double a = Double.valueOf(2.3);
        Double b = Double.valueOf(2.3);
        Double c = Double.valueOf(2.3);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == a);
    }   
}
/*OUTPUT: false output aaya kyuki valueOf method se jo values return hongi un me minor point ka difference ho 
sakta h,or fir different objects hi banange agar values m minor sa difference bhi h to or sub ka ref. code alag 
alag hi hoga or comparison kr rhe h to false value generate hogi.
false
false
false
*/