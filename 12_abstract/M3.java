abstract class M3 {

    //method member 
    static void circle() {
        System.out.println("Area");
    }

    abstract void colour();

}

class N extends M3 {

    void colour() {
        System.out.println("Red");
    }
    //main method 
    public static void main(String[] args) {

        N x = new N();
        
        x.colour();
        x.circle();

    }
}
/* OUTPUT:  happily compiled and runed
            Red
            Area   */