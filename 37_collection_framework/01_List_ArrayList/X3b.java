/*Concept:length()method Object class m nhi h,lekin String class m h,to ArrayList k har 1 record ko type-cast kr
          do String m,or fir length()method aaply ho jayegi.*/    
import java.util.ArrayList;
import java.util.Iterator;
class X3b {
    //main method
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan"); //index-0, internally auto-boxing hogi.
        x.add("ganesh"); //index-1, internally auto-boxing hogi.
        x.add("vikram"); //index-2, internally auto-boxing hogi.
        x.add("raj"); //index-3, internally auto-boxing hogi.
        x.add("swaraj"); //index-4, internally auto-boxing hogi.

        Iterator itr = x.iterator();//iterator() ArrayList class ki method Iterator return krti h,in a proper sequence.

        while(itr.hasNext()) {//hasNext()method boolean return krti h,jub tak iteration m more elements h.
            String str =/*type-Cast*/(String)itr.next();//next()method next Element(E) return krti h ArrayList m se.
            System.out.println(str.length() + " :Length");/*length()method Object class m nhi h,isley String
                                                               m type-cast krne k baad call kri. */
        }
    }
}
/*OUTPUT:
5 :Length
6 :Length
6 :Length
3 :Length
6 :Length */