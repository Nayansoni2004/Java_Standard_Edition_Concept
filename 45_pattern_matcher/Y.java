import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Y {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("a.b");//<-Pattern

        Matcher m = p.matcher("a_bxma b*Ya#b");//<-target String

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT: explanation in copy...

D:\javaprac\45_pattern_matcher>java Y
Match: a_b start: 0 end: 3
Match: a b start: 5 end: 8
Match: a#b start: 10 end: 13
 */