import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z1 {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile(".*?xx");//<-Pattern

        Matcher m = p.matcher("_7$hj#xxrt pq9_xxuJw1");//<-target String

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT: explanation in copy...

D:\javaprac\45_pattern_matcher>java Z1
Match: _7$hj#xx start: 0 end: 8
Match: rt pq9_xx start: 8 end: 17
 */