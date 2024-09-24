import java.util.regex.Pattern;

class C {
    //main method
    public static void main(String... args) {
        Pattern p = Pattern.compile("mohan");//<static method.

        System.out.println(p);//<-Pattern class ka ref. obj.
        System.out.println(p.toString());
    }

}
/*OUTPUT:Pattern class ka construtor private h to hum object nhi bana sakte Pattern class ka,to hum Pattern class
         ki static method->compile(String regex) ka use kr k Pattern class ka obj. create krege or uska ka ref.
         code Pattern class ref. class m hold kr lenge,or Pattern ref. var. ko print krne pr object ka ref. code
         print nhi hota,wo String value print hoti h jo humne method m wrap ki h,kyuki Pattern class ne String
         class ki toString()<-method ko meaningfully override kia h.
         
D:\javaprac\45_pattern_matcher>javac C.java

D:\javaprac\45_pattern_matcher>java C
mohan
mohan
 */