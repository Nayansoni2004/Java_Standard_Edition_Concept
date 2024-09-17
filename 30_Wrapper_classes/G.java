class G {
    //main method
    public static void main(String[] args) {
        Character a = 'A';
        Character b = 'A';
        Character c = 'A';
       // a b c var. k reference code ka comparison ho rha h...
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
    }    
}
/*OUTPUT: object kewal 1 bar banega constant pool memory m or use object ka ref. code b or c var. m hold ho jayega...
true
true
true
*/