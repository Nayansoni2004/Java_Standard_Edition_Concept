class F {
    //main method
    public static void main(String[] args) {
        //array declaration cum instantiation.
        String[] x = new String[3]; //array ko instantiate krte samay galti se bhi size dena nhi bhoolna h.

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}
/* OUTPUT:
null
null
null
kyuki humne array var. ko explicitely koi value se initialize nhi kia h,isley entire arr. k index elements pr 
by default implicitely null value assign ho jayegi,kyuki arr. String type ka h. or entire arr. obj. ref. var. x
through arr. k index elements ko access krne pr har index ki null value print hogi.
*/