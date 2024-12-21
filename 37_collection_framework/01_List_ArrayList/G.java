/*Concept: Duplicate records are allowed in ArrayList,lekin remove() method call krne pr kewal or kewal first 
           occurence wala record remove hoga ArrayList m se. */
import java.util.ArrayList;
class G {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("mohan");
        x.add("gohan");
        x.add("tohan");
        x.add("mohan");

        System.out.println(x);

        boolean flag = x.remove("mohan"); //auto-boxing hogi,kyuki hum ne String Object pass kia h.

        System.out.println(flag);

        System.out.println(x);
    }
}
/*OUTPUT:
[mohan, sohan, rohan, mohan, gohan, tohan, mohan]
true
[sohan, rohan, mohan, gohan, tohan, mohan]  */