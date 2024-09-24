import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z4 {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("\\d\\d");//<-Pattern

        //Matcher m = p.matcher("21 mohan my best friend");//<-target String
        Matcher m = p.matcher("2 mohan my best friend"); //<-target String

        if(m.lookingAt()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        } else {
            System.out.println("No match Found! your target String does'nt starts with the Pattern");
        }
    }

}
/*OUTPUT: explanation in copy...
D:\javaprac\45_pattern_matcher>java Z4
Match: 21 start: 0 end: 2 */

/*OUTPUT: explanation in copy...
D:\javaprac\45_pattern_matcher>javac Z4.java

D:\javaprac\45_pattern_matcher>java Z4
No match Found! your target String does'nt starts with the Pattern
 */