import java.util.regex.Pattern;
import java.util.regex.Matcher;

class O1 {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("[abc5]");//<-represents pattern.

        Matcher matcher = pattern.matcher("Ua yna567_b %zc");//<-target String

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT: a,b,c or 5 m se 1 bhi occurence mila to match mana jayega.

D:\javaprac\45_pattern_matcher>java O1
Match: a start: 1 end: 2
Match: a start: 5 end: 6
Match: 5 start: 6 end: 7
Match: b start: 10 end: 11
Match: c start: 14 end: 15
 */
