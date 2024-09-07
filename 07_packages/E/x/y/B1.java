//package declaration.
package x.y;

//import statement.
import a.b.c.A1;

class B1 extends A1 {
    //main method.
    public static void main(String[] args) {
        
        B1 b = new B1();

        System.out.println(b.x);
    }

}
/*
OUTPUT:111

IN PUBLIC CASE:
Access through inheritance is possible when a class and its variable is defined as public and the .java files are 
placed in different folders */