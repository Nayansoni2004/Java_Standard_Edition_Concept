import java.util.regex.Pattern;
import java.util.regex.Matcher;

class H {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        System.out.println(m.group());
    }

}
/*OUTPUT:bina find(), lookingAt(), matches() call kiye start(), end() , group() call nhi kr sakte.

D:\javaprac\45_pattern_matcher>java H
Exception in thread "main" java.lang.IllegalStateException: No match found
        at java.base/java.util.regex.Matcher.group(Matcher.java:644)
        at java.base/java.util.regex.Matcher.group(Matcher.java:603)
        at H.main(H.java:11)
 */