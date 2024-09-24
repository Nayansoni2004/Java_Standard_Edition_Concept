import java.util.regex.Pattern;
import java.util.regex.Matcher;

class S {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("[a-z&&[def]]");//<-Pattern

        Matcher m = p.matcher("mohan is a good friend of mine");//<-target string

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}
/*OUTPUT:[a-z&&[def]]<-means isme se intersection m jo bhi part common h wo match hoga,to def common h to target
         String m jaha-jaha pr def match found ho print kr dena.
D:\javaprac\45_pattern_matcher>java S
Match: d start: 14 end: 15
Match: f start: 16 end: 17
Match: e start: 19 end: 20
Match: d start: 21 end: 22
Match: f start: 24 end: 25
Match: e start: 29 end: 30
 */