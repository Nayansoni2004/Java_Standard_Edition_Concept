import java.util.regex.Pattern;
import java.util.regex.Matcher;

class W {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("0[xX][0-9a-f]{2,4}");//<-Pattern

        Matcher m = p.matcher("Y_#0xc91j_0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_0xQtpy");//target String

        System.out.println("Y_#0xc91j_0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_0xQtpy");

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT: explanation in copy...
D:\javaprac\45_pattern_matcher>java W
Y_#0xc91j_0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_0xQtpy
Match: 0xc91 start: 3 end: 8
Match: 0x2a7c start: 10 end: 16
Match: 0Xf8b4 start: 20 end: 26
Match: 0x7e start: 35 end: 39
 */