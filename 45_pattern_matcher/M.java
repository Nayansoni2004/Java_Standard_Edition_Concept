import java.util.regex.Pattern;
import java.util.regex.Matcher;

class M {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("\\w");//<-Pattern

        Matcher matcher = pattern.matcher("#$2)@M ^_g");//<-target String

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT: \\w<-means A SINGLE CHARACTER that includes a-z,A-Z,0-9,_<-underscore.

D:\javaprac\45_pattern_matcher>java M
Match: 2 start: 2 end: 3
Match: M start: 5 end: 6
Match: _ start: 8 end: 9
Match: g start: 9 end: 10
 */