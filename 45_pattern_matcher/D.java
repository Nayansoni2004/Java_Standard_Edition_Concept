import java.util.regex.Pattern;

class D {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("mohan");//<-static method

        System.out.println(p);
        System.out.println(p.toString());
        System.out.println(p.pattern());//<-retruns the regular expression from which this pattern was compiled.
    }

}
/*OUTPUT: Pattern class ki pattern()<-non-static method String form m wo String pattern return krti h jo 
          compile()<-method m wrap hota h.

D:\javaprac\45_pattern_matcher>javac D.java

D:\javaprac\45_pattern_matcher>java D
mohan <-pattern ref. obj. var. ka output.
mohan <-toString()method ka output.
mohan <-pattern()method ka output.
 */