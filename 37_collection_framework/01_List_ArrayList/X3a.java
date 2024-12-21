//Concept:is example m hum ArrayList iterate krne k sath record ki length bhi print krne ki kosis kr rhe h. 
import java.util.ArrayList;
import java.util.Iterator;
class X3a {
    //main method
    public static void main(String[] args) {
        ArrayList<String>  x = new ArrayList<String>();

        x.add("mohan"); //index-0 ,internally auto-boxing hogi.
        x.add("ganesh"); //index-1 ,internally auto-boxing hogi.
        x.add("vikram"); //index-2 ,internally auto-boxing hogi.
        x.add("raj"); //index-3 ,internally auto-boxing hogi.
        x.add("swaraj"); //index-4 ,internally auto-boxing hogi.

        Iterator itr = x.iterator();//iterator() ArrayList class ki method Iterator return krti h,in a proper sequence.

        while(itr.hasNext()) {//hasNext()method boolean return krti h,jub tak iteration m more elements h.
            System.out.println(itr.next().length() + "=========");//next()method next Element(E) return krti h ArrayList m se.
        }
    }
}
/*OUTPUT: length() method Object class m nhi h,isley error de rha h,type-cast kr do problem solve ho jayegi.
X3a.java:17: error: cannot find symbol
            System.out.println(itr.next().length() + "=========");
                                         ^
  symbol:   method length()
  location: class Object
1 error */