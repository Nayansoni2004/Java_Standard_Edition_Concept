abstract class X {

    //method members 
    abstract void pro();
    abstract void info();
    abstract void hello();

}

abstract class Y extends X {

    void pro() {
        System.out.println("pro method is accessed.");
    }

}

abstract class Z extends Y {

    void info() {
        System.out.println("info method is accessed.");
    }

}

class P1 {
    void hello() {
        System.out.println("hello method is accessed.");
    }
    //main method...
    public static void main(String[] args) {

        P1 p = new P1();
        Z z = new Z();
        Y y = new Y();
        X x = new X();
        x.hello();
    }
}
/* P1.java:34: error: Z is abstract; cannot be instantiated
        Z z = new Z();
              ^
P1.java:35: error: Y is abstract; cannot be instantiated
        Y y = new Y();
              ^
P1.java:36: error: X is abstract; cannot be instantiated
        X x = new X();
              ^
3 errors
*/

