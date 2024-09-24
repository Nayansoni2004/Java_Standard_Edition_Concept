import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        while(m.find()) {
            System.out.println(m);
        }
    }    

}
/*OUTPUT:Matcher object ko print krne pe jitni baar String "mohan" occurence milega utni baar print hoga.

D:\javaprac\45_pattern_matcher>java G
java.util.regex.Matcher[pattern=mohan region=0,78 lastmatch=mohan]
java.util.regex.Matcher[pattern=mohan region=0,78 lastmatch=mohan]
java.util.regex.Matcher[pattern=mohan region=0,78 lastmatch=mohan]
 */