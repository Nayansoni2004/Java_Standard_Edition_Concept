import java.util.regex.Pattern;
import java.util.regex.Matcher;

class U {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("0[xX][0-9a-f]");//<-Pattern.

        Matcher m = p.matcher("Y_#0xt9J_0x27c9j_ 0Xfab4Ynjk _Uws0x7a85gk*_0xQtpy");//<-target String

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT: explanation in copy...

D:\javaprac\45_pattern_matcher>java U
Match: 0x2 start: 9 end: 12
Match: 0Xf start: 18 end: 21
Match: 0x7 start: 33 end: 36
 */