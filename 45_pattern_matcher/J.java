import java.util.regex.Pattern;
import java.util.regex.Matcher;

class J {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("\d");

        Matcher matcher = pattern.macther("mohan scored 9 out of 10");

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT:java ise->(\)backward slash nhi treat kr rha h,ye escape character treat ho rha h isley double bar
         lagana padega.

D:\javaprac\45_pattern_matcher>javac J.java
J.java:7: error: illegal escape character
        Pattern pattern = Pattern.compile("\d");
                                            ^
1 error
 */