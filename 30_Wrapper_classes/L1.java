class L1 {
    //main method
    public static void main(String[] args) { 
        Float a = Float.valueOf(2.3f);
        Float b = Float.valueOf(2.3f);
        Float c = Float.valueOf(2.3f);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == a);
    }    
}
/*OUTPUT: false aaya kyuki value comparison ho rha h or floating point values minor bhi ho sakti h,to object 
constant pool memory m alag alag banenge or sub m different floating point values ho sakti h!
false
false
false
*/