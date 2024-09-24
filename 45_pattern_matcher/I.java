import java.util.regex.Pattern;
import java.util.regex.Matcher;

class I {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("sohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        if(m.find()) {
            System.out.println(m.group());
        }
    }

}
/*OUTPUT: kuch print nhi hoga, kyuki find() false return krega to hum if()<-k andar nhi aa payenge to 
          illegalStateException nhi aayega.or kuch bhi print nhi hoga.

D:\javaprac\45_pattern_matcher>javac I.java

D:\javaprac\45_pattern_matcher>java I
  */