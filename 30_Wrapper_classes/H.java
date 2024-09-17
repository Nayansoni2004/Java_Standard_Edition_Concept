class H {
    //main method
    public static void main(String[] args) {
        Byte a = 2;
        Byte b = 2;
        Byte c = 2;
    //object constant pool memory m sirf 1 bar banega or usi object ka ref. code b or c var. m bhi hold ho jayega...
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
    }    
}
/*OUTPUT: true output aaya kyuki ref. var. m rakhe object k ref. code ka comparison ho rha h....
true
true
true
*/