import java.util.regex.Pattern;
import java.util.regex.Matcher;

class V {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("0[xX][0-9a-f]{2}");//<-Pattern

        Matcher m = p.matcher("Y_#0xt9J_0x2a7c9j_ 0Xf8b4Ynjk _Uws0x7e85gk* 0xbrj_0xQtpy");//<-target String

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT: dry run output is: 0x2a, 0Xf8, 0x7e.

D:\javaprac\45_pattern_matcher>java V
Match: 0x2a start: 9 end: 13
Match: 0Xf8 start: 19 end: 23
Match: 0x7e start: 34 end: 38
 */