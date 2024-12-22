import java.util.HashSet;
import java.util.Iterator;
class F {
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

        for(    ; itr.hasNext();    ) { //ye valid for loop h kyuki Set Interface indexing support nhi krta h.
            System.out.println(itr.next());
        } 

      /*for(int i = 0 ; i < set.size() ; i++) { //Set Interface indexing support nhi krta h,isley ye for loop nhi chalega.
            System.out.println(set.get(i));
        }*/
    }
}
/*OUTPUT:
murugan
indra
vishnu
shiv
kartik
ganesh */