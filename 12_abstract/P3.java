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

class P3 extends Z {
    void hello() {
        System.out.println("hello method is accessed.");
    }
    void bye() {
        System.out.println("bye method is accessed.");
    }
    //main method...
    public static void main(String[] args) {

        P3 p = new P3();
        
        p.pro();
        p.info();
        p.hello();
        p.bye();
        
    }
}
/*   happily compiled...
pro method is accessed.
info method is accessed.
hello method is accessed.
bye method is accessed.
*/