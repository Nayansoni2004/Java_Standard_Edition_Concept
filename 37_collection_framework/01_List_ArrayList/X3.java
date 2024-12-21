/*Concept:ArrayList m iterate kr rhe h, ArrayList ki iterator() method or Iterator Interface ki hasNext() or 
          next() method ka use kr k.*/
import java.util.ArrayList;
import java.util.Iterator;
class X3 {
    //main method
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan"); //index-0 ,internally auto-boxing hogi.
        x.add("ganesh"); //index-1 , internally auto-boxing hogi.
        x.add("vikram"); //index-2 , internally auto-boxing hogi.
        x.add("raj"); //index-3 , internally auto-boxing hogi.
        x.add("swaraj"); //index-4 , internally auto-boxing hogi.

        Iterator itr = x.iterator();//iterator() ArrayList class ki method Iterator return krti h,in a proper sequence.

        while(itr.hasNext()) {//hasNext()method boolean return krti h,jub tak iteration m more elements h.
            System.out.println(itr.next() + "========");//next()method next Element(E) return krti h ArrayList m se.
        }  
    }
}
/*OUTPUT:
mohan========
ganesh========
vikram========
raj========
swaraj======== */