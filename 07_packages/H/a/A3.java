/* concept of this code: private member of a class can only be accessed inside a class, and it can't be accessed 
outside the class*/

//package declaration.
package a;

public class A3 {
    private char c = 'D';

    private void pro() {
        System.out.println(c);
    }

    void info() {
        pro();
    }

    //main method.
    public static void main(String[] args) {

        A3 a = new A3();

        a.info();

        a.pro();

        System.out.println(a.c);
    }
}
/*
OUTPUT:D
D
D
*/