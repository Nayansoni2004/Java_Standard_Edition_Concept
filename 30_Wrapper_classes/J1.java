class J1 {
    //main method
    public static void main(String[] args) {
        Integer a = Integer.valueOf(2);
        Integer b = Integer.valueOf(2);
        Integer c = Integer.valueOf(2);

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