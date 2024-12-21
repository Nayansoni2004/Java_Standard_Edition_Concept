//Concept:length()method Object class m nhi h,isley Iterator Interface ko type-safe declare kr k call kri.
import java.util.ArrayList;
import java.util.Iterator;
class X4 {
    //main method
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan"); //index-0, internally auto-boxing hogi.
        x.add("ganesh"); //index-1, internally auto-boxing hogi.
        x.add("vikram"); //index-2, internally auto-boxing hogi.
        x.add("raj"); //index-3, internally auto-boxing hogi.
        x.add("swaraj"); //index-4, internally auto-boxing hogi.

        Iterator<String> itr = x.iterator();//iterator() ArrayList class ki method Iterator return krti h,in a proper sequence.

        while(itr.hasNext()) {//hasNext()method boolean return krti h,jub tak iteration m more elements h.
            System.out.println(itr.next().length() + " :Length");/*length()method Object class m nhi h,isley
                                                                   Iterator ko type-safe krne k baad call kri.*/
        }
    }
}
/*OUTPUT:
5 :Length
6 :Length
6 :Length
3 :Length
6 :Length */