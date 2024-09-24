import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z2 {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("[A-Za-z0-9\\._%+\\-]+@[A-Za-z0-9\\.\\-]+\\.[A-Za-z]{2,}");//<-Pattern

        //Matcher m = p.matcher("mohan-das23@gmail.com");
        Matcher m = p.matcher("mohan-das23#gmail.com");

        if(m.matches()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        } else {
            System.out.println("No Match Found! Not a valid gmail I'D");
        }
    }

}
/*OUTPUT: explanation copy...
D:\javaprac\45_pattern_matcher>java Z2
Match: mohan-das23@gmail.com start: 0 end: 21 */

/*OUTPUT: explanation in copy...
D:\javaprac\45_pattern_matcher>java Z2
No Match Found! Not a valid gmail I'D */