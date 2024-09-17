class H1 {
    //main method
    public static void main(String[] args) {
        Byte a = Byte.valueOf((byte)2);
        Byte b = Byte.valueOf((byte)2);
        Byte c = Byte.valueOf((byte)2);
    //a b c var. m rakhe ref. code k through object m rakhi values ka comparison ho rha h... 
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
    }    
}
/*OUTPUT: valueOf method object m rakhi value ko return krti h.
true
true
true
*/
