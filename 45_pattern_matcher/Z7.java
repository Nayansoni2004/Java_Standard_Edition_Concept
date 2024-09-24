import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z7 {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("[A-Za-z0-9\\._%+\\-]+@[A-Za-z0-9\\.\\-]+\\.[A-Za-z]{2,}");//Pattern

        Matcher m = p.matcher("mohan-das789@gmail.com is my mail id");//<-target String

        if(m.find()) {
        //if(m.matches()) { 
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        } else {
            System.out.println("No Match Found!Pattern doesn't match target String!!!");
        }
    }

}
/*OUTPUT:humne find()<-call kia h or find() entire pattern match nhi krta h thoda-thoda kr k match krta h,isley
         invalid target String mail bhi match ho gya,lekin matches()<-entire Pattern ko match krta h,isley 
        matches()call krne pr valid email aaya.
D:\javaprac\45_pattern_matcher>javac Z7.java

D:\javaprac\45_pattern_matcher>java Z7
No Match Found!Pattern doesn't match target String!!!

D:\javaprac\45_pattern_matcher>javac Z7.java

D:\javaprac\45_pattern_matcher>java Z7
Match: mohan-das789@gmail.com start: 0 end: 22
 */