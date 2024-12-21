import java.util.ArrayList;
class D {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //auto-boxing hogi,kyuki String Object banega.
        x.add("sohan"); //auto-boxing hogi,kyuki String Object banega.
        x.add("rohan");  //auto-boxing hogi,kyuki String Object banega.
        x.add("gohan"); //auto-boxing hogi,kyuki String Object banega.
        x.add("tohan"); //auto-boxing hogi,kyuki String Object banega.

       // System.out.println(x);
       // System.out.println(x.size());

       // boolean flag = x.contains("eohan"); //String Object pass krenge contains()method m.
        boolean flag = x.contains("rohan"); //String Object pass krenge contains()method m.

        System.out.println(flag);
    }
}
/*OUTPUT:
D:\javaprac\37_collections>java D
false

D:\javaprac\37_collections>javac D.java
Note: D.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\javaprac\37_collections>java D
true
 */