class B2 {
    //NOT A(static initialization block)...it's a static method.
    static void pro() {
        System.out.println("A");
    }
    //main method
    public static void main(String[] args) {

        B2.pro();
        B2.pro();
        B2.pro();
        B2.pro();
        B2.pro();
        B2.pro();
    }
}
/* OUTPUT: 
A
A
A
A
A
A
method bina call kiye run nhi hoti...initialization blocks automatic run hote h...or static method ko class 
context m direct access kr sakte h,legal h,isley classname dot member name likh k call kr sakte h...or 
method ko jitni bar call krte h,utni bar method run hoti h...
*/ 