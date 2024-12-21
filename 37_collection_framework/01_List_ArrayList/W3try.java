class W3try {
    //main method
    public static void main(String[] args) {
        Integer x = Integer.valueOf(300); //auto-boxing hogi.
        Integer y = Integer.valueOf(300); //auto-boxing hogi.
       // System.out.println(x == y); //objects ka ref. code compare krega.
        System.out.println(x.equals(y)); /*true output aaya kyuki equals()method Object class ki Integer wrapper
                                           class m well-implemented h,or objects ki value m comparison kregi.*/
    }
}
/*OUTPUT: double equals ka output:
false */
/*OUTPUT: equals()method ka output:
true
 */