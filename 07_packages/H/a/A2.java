/* concept of this code : private member of a class can only be accessed inside a class, and it can't be accessed
outside the class*/

//package declaration.
package a;

public class A2 {

    private String name = "Aman soni";
    
    private void pro() {
        System.out.println(name);
    }

    void info() {
        pro();
    }

    //main method.
    public static void main(String[] args) {

        A2 a = new A2();

        a.info();

        a.pro();

        System.out.println(a.name);
    }
}
/*
OUTPUT:Aman soni
Aman soni
Aman soni
*/