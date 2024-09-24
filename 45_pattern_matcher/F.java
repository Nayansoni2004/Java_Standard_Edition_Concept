import java.util.regex.Pattern;
import java.util.regex.Matcher;

class F {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        while(m.find()) {
            System.out.println("group(): " + m.group() + " start(): " + m.start() + " end(): " + m.end());
        }
    }

}
/*OUTPUT: Pattern ka group(),start()index or index()index kitni bar occurence hua h ye print kia h isme humne!
D:\javaprac\45_pattern_matcher>javac F.java

D:\javaprac\45_pattern_matcher>java F
group(): mohan start(): 0 end(): 5
group(): mohan start(): 24 end(): 29
group(): mohan start(): 52 end(): 57
 */