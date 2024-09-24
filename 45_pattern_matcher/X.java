import java.util.regex.Pattern;
import java.util.regex.Matcher;

class X {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("0[xX][0-9a-f]?");//<-Pattern

        Matcher m = p.matcher("Y_#0xc91j_0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_0xQtpy");//<-target String

        System.out.println("Y_#0xc91j_0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_0xQtpy");

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT: explanation in copy...
D:\javaprac\45_pattern_matcher>java X
Y_#0xc91j_0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_0xQtpy
Match: 0xc start: 3 end: 6
Match: 0x2 start: 10 end: 13
Match: 0Xf start: 20 end: 23
Match: 0x7 start: 35 end: 38
Match: 0xb start: 46 end: 49
Match: 0x start: 52 end: 54
 */