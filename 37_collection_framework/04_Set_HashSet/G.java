import java.util.HashSet;
import java.util.Iterator;
class G {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");

        Iterator itr = set.iterator();

        while(itr.hasNext()) { //refined implementation rather than using for loop,we use while loop to iterate.
           // System.out.println(itr.next().length()); //Object class m length() nhi h isley use nhi kr sakte.
           System.out.println(itr.next().toString()); //toString()method jo bhi Object milega uska String value return kregi.
        }
    }
}
/*OUTPUT:
murugan
indra
vishnu
shiv
kartik
ganesh */