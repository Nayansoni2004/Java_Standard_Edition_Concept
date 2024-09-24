import java.util.regex.Pattern;
import java.util.regex.Matcher;

class N {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("\\s");//<-means a whiteSpace character.

        Matcher matcher = pattern.matcher("# $\t)@\n^\rg"); //<-target String

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }
}
/*OUTPUT:
D:\javaprac\45_pattern_matcher>java N
Match:   start: 1 end: 2 _<-space aya.
Match:   start: 3 end: 4 \t<-tab space aya.
Match:                    \n<-new line aa gyi.
 start: 6 end: 7           \r<-cursor wapis se line k start point pe chala gya.
 start: 8 end: 9
 */