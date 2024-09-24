import java.util.regex.Pattern;

class A {
    //main method
    public static void main(String... args) {
        Pattern p = new Pattern();
    }    

}
/*OUTPUT:Pattern class ka object nhi bana sakte,kyuki Pattern class ka constructor api library m private h.

D:\javaprac\45_pattern_matcher>javac A.java
A.java:6: error: constructor Pattern in class Pattern cannot be applied to given types;
        Pattern p = new Pattern();
                    ^
  required: String,int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
 */