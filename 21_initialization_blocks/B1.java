class B1 {
    //NOT A(static initialization block)...it's a static method.
    static void pro() {
        System.out.println("A");
    }
    //main method
    public static void main(String[] args) {
        B1 x = new B1();

        B1 y = new B1();

        B1 z = new B1();
    }
}
/* happily compiled...but kuch print nhi hua...kyuki B1 class m static method h...or methods bina call kiye run
nhi hoti...methods ko run krne k liye call krna padta h....kewal initialization blocks automatic run hote h.
*/