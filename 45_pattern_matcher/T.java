import java.util.regex.Pattern;
import java.util.regex.Matcher;

class T {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("0x[0-9a-f]");//<-Pattern

        Matcher m = p.matcher("Y_#0xt9J_0x2a7c9j_ 0Xfab4Ynjk _Uws0x7a85gk*_0xQtpy");//<-target String

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT: explanation in copy...
D:\javaprac\45_pattern_matcher>java T
Match: 0x2 start: 9 end: 12
Match: 0x7 start: 34 end: 37
 */