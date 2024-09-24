import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("\\d\\d");

        Matcher matcher = pattern.matcher("mohan scored 9 out of 10");

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT: (\\d\\d)<-iska matlab two digit occurence dhund rhe h hum target String m.
D:\javaprac\45_pattern_matcher>java K
Match: 10 start: 22 end: 24
 */