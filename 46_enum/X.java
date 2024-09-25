enum AAA {

}

class X extends AAA {
    //main method
    public static void main(String[] args) {
        
    }
}
/*OUTPUT:enum ik final class h usko hum inheritance k through access nhi kr sakte,kewal instantiate kr sakte h.
         means enum ka sub-class nhi bana sakte.
D:\javaprac\46_enum>javac X.java
X.java:5: error: cannot inherit from final AAA
class X extends AAA {
                ^
X.java:5: error: enum types are not extensible
class X extends AAA {
^
2 errors
 */