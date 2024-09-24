import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L1 {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("aba");//<-Pattern

        Matcher matcher = pattern.matcher("ababababa");//<-represents target String

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT: first two consecutive triple digit occurence match ho jayega.

D:\javaprac\45_pattern_matcher>java L1
Match: aba start: 0 end: 3
Match: aba start: 4 end: 7
 */