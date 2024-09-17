class E1 {
    //main method
    public static void main(String[] args) {
        Boolean a = Boolean.valueOf(true);
        Boolean b = Boolean.valueOf(true);
        Boolean c = Boolean.valueOf(true);
        //a b c var. ka reference code same h kyuki teeno var. m 1 hi object ka ref. code rakha h....
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