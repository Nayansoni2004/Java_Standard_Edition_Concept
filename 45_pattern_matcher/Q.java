import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Q {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("[e-m]");//<-Pattern: e,f,g,h,i,j,k,l,m.

        Matcher m = p.matcher("mohan is a good friend of mine");//<-target String

        while(m.find()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }

}
/*OUTPUT:[e-m] <-means e to m i.e, e,f,g,h,i,j,k,l,m<-jitne bhi characters h wo sare match m found honge,or print
         honge.
D:\javaprac\45_pattern_matcher>java Q
Match: m start: 0 end: 1
Match: h start: 2 end: 3
Match: i start: 6 end: 7
Match: g start: 11 end: 12
Match: f start: 16 end: 17
Match: i start: 18 end: 19
Match: e start: 19 end: 20
Match: f start: 24 end: 25
Match: m start: 26 end: 27
Match: i start: 27 end: 28
Match: e start: 29 end: 30
 */