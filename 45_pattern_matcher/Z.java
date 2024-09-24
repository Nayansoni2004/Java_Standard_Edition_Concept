import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile(".*xx");//<-Pattern

        Matcher m = p.matcher("_7$hj#xxrt pq9_xxuJw1");//<-target String

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT: dry run in copy...
D:\javaprac\45_pattern_matcher>java Z
Match: _7$hj#xxrt pq9_xx start: 0 end: 17
 */