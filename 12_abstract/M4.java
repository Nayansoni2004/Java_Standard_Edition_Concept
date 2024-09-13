abstract class M4 {

    //method member 
    static void circle() {
        System.out.println("Area");
    }

    abstract void colour();

}

class N extends M4 {

    static void colour() {
        System.out.println("Red");
    }
    //main method 
    public static void main(String[] args) {

        N x = new N();
        
        x.colour();
        x.circle();

    }
}
/* M4.java:14: error: colour() in N cannot override colour() in M4
    static void colour() {
                ^
  overriding method is static
1 error
*/
//REASON OF ERROR: ?  