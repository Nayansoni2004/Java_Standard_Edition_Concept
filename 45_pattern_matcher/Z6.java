import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z6 {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile(args[0]);//<-Pattern

        Matcher m = p.matcher(args[1]);//<-target String

        if(m.matches()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        } else {
            System.out.println("No Match Found! Entered Pattern doesn't match with the Target String!!!");
        }
    }

}
/*OUTPUT: dry-run in copy...
D:\javaprac\45_pattern_matcher>javac Z6.java

D:\javaprac\45_pattern_matcher>java Z6 [6-9][0-9]{9} 7999812015
Match: 7999812015 start: 0 end: 10

D:\javaprac\45_pattern_matcher>java Z6 [6-9][0-9]{9} 5678786578
No Match Found! Entered Pattern doesn't match with the Target String!!!
 */