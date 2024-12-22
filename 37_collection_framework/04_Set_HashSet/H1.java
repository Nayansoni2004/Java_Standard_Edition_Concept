import java.util.HashSet;
class H1 {
    //main method
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("kartik");
        set.add("ganesh");
        set.add("murugan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");
        set.add("surya");
        set.add("pawan");
//using Enhanced-for loop for iterating the HashSet.
        for(String a : set) { //yaha pr String likh sakte h,kyuki type-safe declare kia h.
        System.out.println(a); //String class ki overiding method toString() call hogi,or String value return kregi.
        }
    }
}
/*OUTPUT:
murugan
surya
indra
vishnu
shiv
kartik
ganesh
pawan */