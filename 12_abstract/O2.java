abstract class U {

    //method members...
    abstract void shape();
    abstract void color();

}

class O2 extends U {

    void shape() {
        System.out.println("rectangle");
    }
    void color() {
        System.out.println("red");
    }
    //main method 
    public static void main(String[] args) {

        O2 o = new O2();

        o.shape();
        o.color();

    }
}
/* OUTPUT:  rectangle
            red    */