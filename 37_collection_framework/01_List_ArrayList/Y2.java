//Concept:re-indexing to hogi or size bhi fix h to loop 4 time hi chalega,or har bar 0 index element remove hoga.
import java.util.ArrayList;
class Y2 {
    //main method
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan"); //re-indexing, internally auto-boxing hogi
        x.add("ganesh"); //re-indexing, internally auto-boxing hogi
        x.add("vikram"); //re-indexing, internally auto-boxing hogi
        x.add("raj"); //re-indexing, internally auto-boxing hogi
        x.add("swaraj"); //re-indexing, internally auto-boxing hogi

        System.out.println(x); //internally toString() object class ki method call hogi,print hone se pahle.

        int size = x.size(); 
        for(int i = 0 ; i < size ; i++) {
            System.out.println(x.remove(0));
        }

        System.out.println(x);//isme internally toString() call nhi hoga,kyuki koi record hi nhi h convert krne.
    }
}
/*OUTPUT:
[mohan, ganesh, vikram, raj, swaraj]
mohan
ganesh
vikram
raj
swaraj
[]
 */