/* class ka private member whether its a variable or a method can only be accessed inside a class ,and it can't be
accessed outside the class*/

//package declaration.
package a;

public class A1 {

    private int d = 888;

    private void pro() {
        System.out.println(d);
    }

    void info() {
        pro();
    }

    //main method.
    public static void main(String[] args) {

        A1 a = new A1();
        
        a.info();

        a.pro();

        System.out.println(a.d);
    }
}
/*
OUTPUT:888
888
888
*/