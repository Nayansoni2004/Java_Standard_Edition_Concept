import java.util.regex.Pattern;
import java.util.regex.Matcher;

class P {
    //main method
    public static void main(String... args) {
        Pattern pattern = Pattern.compile("[^abc5]"); //<-Pattern

        Matcher matcher = pattern.matcher("Ua yna567_b %zc"); //<-target String

        while(matcher.find()) {
            System.out.println("Match: " + matcher.group() + " start: " + matcher.start() + " end: " + matcher.end());
        }
    }

}
/*OUTPUT:[^abc] <-means isme se koi bhi character mile match krte waqt to unko chod dena baki k match krna or 
         print krna.
D:\javaprac\45_pattern_matcher>java P
Match: U start: 0 end: 1
Match:   start: 2 end: 3
Match: y start: 3 end: 4
Match: n start: 4 end: 5
Match: 6 start: 7 end: 8
Match: 7 start: 8 end: 9
Match: _ start: 9 end: 10
Match:   start: 11 end: 12
Match: % start: 12 end: 13
Match: z start: 13 end: 14
 */