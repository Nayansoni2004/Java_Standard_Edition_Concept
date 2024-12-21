//Concept:re-indexing is done while removing element one/by/one from an ArrayList.
import java.util.ArrayList;
class Y {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //re-indexing, internally auto-boxing hogi.
        x.add("ganesh"); //re-indexing, internally auto-boxing hogi.
        x.add("vikram"); //re-indexing, internally auto-boxing hogi.
        x.add("raj"); //re-indexing, internally auto-boxing hogi.
        x.add("swaraj"); //re-indexing, internally auto-boxing hogi.

        System.out.println(x); //internally toString() object class ki method call hogi,print hone se pahle.

        for(int i = 0 ; i < x.size() ; i++) {
            System.out.println(x.remove(i)); //List Interface ka remove(int index)version run hoga->return->Object.
        }

        System.out.println(x); //isme internally toString() call nhi hoga,kyuki koi record hi nhi h convert krne.
    }
}
/*OUTPUT:
[mohan, ganesh, vikram, raj, swaraj]
mohan
vikram
swaraj
[ganesh, raj] */