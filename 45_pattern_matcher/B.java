import java.util.regex.Pattern;

class B {
    //main method
    public static void main(String... args) {
        Pattern p = new Pattern("" , 0);
    }

}
/*OUTPUT: Pattern class ka object nhi bana sakte hum,kyuki api library m Pattern class m constructor summary nhi
          h,means Pattern class ka constructor private h.

D:\javaprac\45_pattern_matcher>javac B.java
B.java:6: error: Pattern(String,int) has private access in Pattern
        Pattern p = new Pattern("" , 0);
                    ^
1 error
 */