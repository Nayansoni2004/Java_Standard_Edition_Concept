abstract class V {

    //method members...
    abstract void color();
    abstract void shape();

}

abstract class O1 extends V {

    void color() {
        System.out.println("Solid Red");
    }
    //main method...
    public static void main(String[] args) {

        O1 o = new O1();

    }

}
/* O1.java:17: error: O1 is abstract; cannot be instantiated
        O1 o = new O1();
               ^
1 error
*/