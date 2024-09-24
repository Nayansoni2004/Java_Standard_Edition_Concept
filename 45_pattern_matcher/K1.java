import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K1 {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("\\d\\d");

        Matcher matcher = pattern.matcher("mohan scored 9 out of 10 and sohan scored 45 out of 250");

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT: two-consecutive occurence dhund rhe h hum target String m.
D:\javaprac\45_pattern_matcher>java K1
Match: 10 start: 22 end: 24
Match: 45 start: 42 end: 44
Match: 25 start: 52 end: 54
 */