import java.util.regex.Pattern;
import java.util.regex.Matcher;

class J1 {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("\\d");//<-means a digit from 0 to 9.

        Matcher matcher = pattern.matcher("mohan scored 9 out of 10");

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT:
D:\javaprac\45_pattern_matcher>java J1
Match: 9 start: 13 end: 14 <-start index, end index of digit.
Match: 1 start: 22 end: 23 <-start index, end index of digit.
Match: 0 start: 23 end: 24 <-start index, end index of digit.
 */