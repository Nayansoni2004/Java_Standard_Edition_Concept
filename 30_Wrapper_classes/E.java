class E {
    //main method
    public static void main(String[] args) {
        Boolean a = true;
        Boolean b = true;
        Boolean c = true;
        //a b c object reference var. ka reference code comparison ho rha h....
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
    }    
}
/*OUTPUT: true aaya kyuki object sirf 1 bar constant pool memory m banega or same ref. code b or c var. m aa 
jayega kyuki values same h...
true
true
true
*/