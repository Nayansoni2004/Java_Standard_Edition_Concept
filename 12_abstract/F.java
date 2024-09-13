abstract class X3 {

    //method declaration
    abstract void pro();

}
class F extends X3 {

    //main method
    public static void main(String[] args) {


    }
}
/* F.java:7: error: F is not abstract and does not override abstract method pro() in X3
class F extends X3 {
^
1 error
POINT 1: abstract class ka object nhi bana sakte.
POINT 2:abstract class ko inheritance k through(sub-class bana k) access to kr sakte h, lekin child class ko bhi
abstract mark krna padega ya phir child class ko abstract mark nhi krna h to abstract class ki abstract methods 
ko child class m define krna padega...or F.java m child class ko na hi abstract mark kia h or na hi abstract class
ki methods ko child class m definition provide ki h isley error aai.
*/ 