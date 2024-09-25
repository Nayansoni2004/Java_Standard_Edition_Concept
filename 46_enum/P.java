abstract class P {
    //main method
    public static void main(String[] args) {
        P x = new P(); //abstract class ka object nhi bana sakte.
    }
}
/*OUTPUT: hum abstract class ko instantiate nhi kr sakte,mtlb abstract class ka object nhi bana sakte.

D:\javaprac\46_enum>javac P.java
P.java:4: error: P is abstract; cannot be instantiated
        P x = new P(); //abstract class ka object nhi bana sakte.
              ^
1 error
 */