//import statement
/*import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.max; */
//or by using (wide card character) we can write this below also,it is legal.
import static java.lang.Math.*;

class I {

    //main method
    public static void main(String[] args) {

        System.out.println(PI);

        System.out.println(E);

        int max = max(80,90);

        System.out.println(max);
    }
}
/* OUTPUT:3.141592653589793
          2.718281828459045
          90 */