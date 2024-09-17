class I1 {
    //main method
    public static void main(String[] args) {
        Short a = Short.valueOf((short)2);
        Short b = Short.valueOf((short)2);
        Short c = Short.valueOf((short)2);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
    }    
}
/*OUTPUT:
true
true
true
*/