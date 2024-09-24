import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z3 {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("mohan");//<-Pattern

        //Matcher m = p.matcher("mohan is my best friend");//<-target String
        Matcher m = p.matcher("is mohan my best friend");//<-target String

        if(m.lookingAt()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        } else {
            System.out.println("No Match Found! your target String doesn't starts with Pattern.");
        }
    }

}
/*OUTPUT: explanation in copy...
D:\javaprac\45_pattern_matcher>java Z3
Match: mohan start: 0 end: 5 */

/*OUTPUT: explanation in copy... 
D:\javaprac\45_pattern_matcher>javac Z3.java

D:\javaprac\45_pattern_matcher>java Z3
No Match Found! your target String doesn't starts with Pattern. */