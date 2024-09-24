import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("aaa"); //<-Pattern
 
        Matcher matcher = pattern.matcher("aaaaaaaa"); //<-target String

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT: first two triple digit occurence match ho gye.
D:\javaprac\45_pattern_matcher>java L
Match: aaa start: 0 end: 3 <-start index, end index of target String.
Match: aaa start: 3 end: 6 <-start index, end index of target String.
 */