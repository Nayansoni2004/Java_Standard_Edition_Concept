import java.util.regex.Pattern;
import java.util.regex.Matcher;

class E {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        System.out.println(p);//<-Pattern obj.
        System.out.println(m);//<-Matcher obj.
    }
}
/*OUTPUT:Pattern class k obj. ref. var. ko print krne pr as it is compile()<-method m wrapped String value print
         hoti h,or Matcher obj. ref. var. ko print krne pr matching record(target String) ki infomation print 
         hoti h.
          
D:\javaprac\45_pattern_matcher>javac E.java

D:\javaprac\45_pattern_matcher>java E
mohan <-Pattern class ka obj.
java.util.regex.Matcher[pattern=mohan region=0,78 lastmatch=] <-Matcher class ka obj.
 */