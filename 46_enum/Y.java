enum BBB {

}

class Y {
    //main method
    public static void main(String[] args) {
        BBB x = new BBB() {

        };
    } 
}
/*OUTPUT:enum ka hum Anonymous-Inner class nhi bana sakte,kyuki Anonymous-Inner class class sub-class bana k 
         banta h,or hum enum ka sub-class to bana hi nhi sakte,kyuki enum final class h or enum ka object bhi
         nhi bana sakte,kyuki automatically bana k milta h,compiler dwara.
         
D:\javaprac\46_enum>javac Y.java
Y.java:8: error: enum types may not be instantiated
        BBB x = new BBB() {
                ^
Y.java:8: error: cannot inherit from final BBB
        BBB x = new BBB() {
                    ^
Y.java:8: error: enum types are not extensible
        BBB x = new BBB() {
                          ^
3 errors
 */