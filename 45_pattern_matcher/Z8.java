import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z8 {
   //main method
   public static void main(String... args) {
    Pattern p = Pattern.compile("^[A-Za-z0-9\\._%+\\-]+@[A-Za-z0-9\\.\\-]+\\.[A-Za-z]{2,}$");//<-Pattern

    Matcher m = p.matcher("mohan-das789@gmail.com is my mail id");//<-target String
    //Matcher m = p.matcher("mohan-das789@gmail.com");

    if(m.find()) {
        //if(m.matches()) { 
        System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
    } else {
        System.out.println("No Match Found! Pattern doesn't match target String!!");
    }
   }

}
/*OUTPUT: is example m humne Pattern m ^<-carrat or $<-dollar lagaya h or isley find()<-method matches() k 
          samaan kam kr rha h ,entire Pattern ko target String se match kr rha h.
D:\javaprac\45_pattern_matcher>javac Z8.java

D:\javaprac\45_pattern_matcher>java Z8
No Match Found! Pattern doesn't match target String!!

D:\javaprac\45_pattern_matcher>javac Z8.java

D:\javaprac\45_pattern_matcher>java Z8
Match: mohan-das789@gmail.com start: 0 end: 22

D:\javaprac\45_pattern_matcher>javac Z8.java

D:\javaprac\45_pattern_matcher>java Z8
No Match Found! Pattern doesn't match target String!!

D:\javaprac\45_pattern_matcher>javac Z8.java

D:\javaprac\45_pattern_matcher>java Z8
Match: mohan-das789@gmail.com start: 0 end: 22
 */