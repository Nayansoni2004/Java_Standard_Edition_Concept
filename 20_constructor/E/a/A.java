//package declaration
package a;

//import statement 
import x.B;

class A {
    //main method
    public static void main(String[] args) {

        B w = new B();

        //System.out.println(w.y);
    }
}
/* happily compiled but kuch print nhi hoga kyuki print statement likha hi nhi h,is example
ka motive :B class m constructor humne nhi banaya h,to compiler supplied constructor compiler
bana k dega or sath hi public acc. control bhi us constructor pr laga k dega,lekin agar constructor
developer banata so it's developer responsibility ki us developer supplied constructor ko public mark
kre,compiler supplied constructor m compiler ne public isley mark kia kyuki class public mark h....
*/