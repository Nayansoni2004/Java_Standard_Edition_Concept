class M {
    //main method
    public static void main(String[] args) {
        Double a = 2.3;
        Double b = 2.3;
        Double c = 2.3;

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
    }    
}
/*OUTPUT: false aaya kyuki point m values minor different ho sakti h or different values hongi bohot hi minor to
bhi object alag alag hi constant pool memory m banenge.or sub ka ref. code different hoga to comparison krne pr
false value generate hogi.
false
false
false
*/