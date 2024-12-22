import java.util.HashSet;
class H {
    //main method
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");
        set.add("surya");
//iterating the HashSet using Enhanced for loop.
        for(Object a : set) { //Object class ki toString() method call hogi,or String value return kregi,set Object k records m se.
            System.out.println(a);
        }
    }
}
/*OUTPUT: HashSet is neither ordered nor sorted collection class,thus also a Hash-based collection class & 
          provides an efficient access.
murugan
surya
indra
vishnu
shiv
kartik
ganesh
 */