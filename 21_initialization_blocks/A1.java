class A1 {
    //instance-level method member...(NOT A INITIALIZATION BLOCK)!                                  
    void pro() {
        System.out.println("A1");
    }
    //main method 
    public static void main(String[] args) {
        A1 x = new A1();

        A1 y = new A1();

        A1 z = new A1();
    }
}
/* happily compiled...but kuch print nhi hua kyuki A1 class m initialization block ki jagah method h or method
bina call kiye run nhi hoti,kewal initialization block automatic run hote h...
*/