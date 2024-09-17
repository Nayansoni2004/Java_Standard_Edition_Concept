class L {
    //main method
    public static void main(String[] args) {
        Float a = 2.3f;
        Float b = 2.3f;
        Float c = 2.3f;

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == a);
    }    
}
/*OUTPUT:false output isley aaya kyuki floating point bich m bhi bohot sare ho sakte h ,to object alag alag banege
constant pool memory m or sub ka ref. code different hoga...to false aayega....
false
false
false
*/