import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z5 {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("[6-9][0-9]{9}");//<-Pattern

        //Matcher m = p.matcher("7898579690");//<-target String
        //Matcher m = p.matcher("5898579690");//<-target String
        //Matcher m = p.matcher("0000000000");//<-target String
        Matcher m = p.matcher("989857969");//<-target String

        if(m.matches()) {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        } else {
            System.out.println("No Match Found! Mobile Number is Invalid!!!");
        }
    }

}
/*OUTPUT: dry-run in copy...
D:\javaprac\45_pattern_matcher>java Z5
Match: 7898579690 start: 0 end: 10 */

/*OUTPUT: dry-run in copy...
D:\javaprac\45_pattern_matcher>java Z5
No Match Found! Mobile Number is Invalid!!! */

/*OUTPUT: dry-run in copy...
D:\javaprac\45_pattern_matcher>java Z5
No Match Found! Mobile Number is Invalid!!! */

/*OUTPUT: dry-run in copy...
D:\javaprac\45_pattern_matcher>java Z5
No Match Found! Mobile Number is Invalid!!! */