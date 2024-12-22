class M {
    //main method
    public static void main(String[] args) {
        Employee e = new Employee();

        System.out.println(e.toString()); //return->obj. ref. code in Hexa-decimal form.
        System.out.println(e.hashCode()); //return->obj. ref. code in decimal form.

        System.out.println(Integer.toHexString(e.hashCode()));/*hashCode()<-return obj. ref. code in decimal
                                                form & toHexString()<-return obj. ref. code in Hex-decimal form.*/
    }
}
class Employee {

}
/*OUTPUT:alpha class Object ki toString()method obj. ka ref. code hexa-decimal form m return krti h.
Employee@36baf30c */

/*OUTPUT:alpha class Object ki hashCode()method wahi obj. ka ref. code decimal form m return krti h.
918221580 */

/*OUTPUT:wrapper class Integer ki toHexString() static method wahi obj. ka ref. code jo decimal form m h,usko
         hex-decimal form m return krti h.
Employee@36baf30c
918221580
36baf30c */