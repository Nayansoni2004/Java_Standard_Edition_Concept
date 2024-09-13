abstract class X1 {
    //method declaration
    abstract void pro();

}

class D {
    //main method 
    public static void main(String[] args) {

        X1 x;  //X1 class ka variable...

        System.out.println("Hello");
        
    }
}
/* OUTPUT: happily compiled....
            Hello

abstract class ka object nhi bana sakte ,lekin abstract class ka reference variable declare kr sakte h,jo ki 
abstract class k reference code ko hold krta, or ye reference code ,object banane m help krta h....
*/