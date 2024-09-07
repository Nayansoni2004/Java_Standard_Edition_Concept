//package declaration
package a.b.c;
//import statement
import x.y.B1;//B1 class ko access kr rhe h apan,import kr k.

class A1 {
    //main method...
    public static void main(String[] args) {
        
        B1 b = new B1();

        System.out.println(b.y);
    }
}

// output:96 happily compiled.