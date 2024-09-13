abstract class X2 {

    //method declaration
    abstract void pro();

}

class E {

    //main method 
    public static void main(String[] args) {

        X2 x = new X2();  //X1 class ka variable or object....

    }
}
/* E.java:13: error: X2 is abstract; cannot be instantiated
        X2 x = new X2();  //X1 class ka variable or object....
               ^
1 error

error aai kyuki abstract class ka object nhi bana sakte,matlab abstract class ko instantiation k through access 
nhi kr sakte,but inheritance k through matlab abstract class ka sub-class(child class) bana k access kr sakte h.

*/