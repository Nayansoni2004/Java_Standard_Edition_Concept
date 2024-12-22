/*Concept:is example h hum TreeSet ko iterate kr rhe h Enhanced forloop ka use kr k or TreeSet class ko type-safe
          class declare kr k.*/
import java.util.TreeSet;
class D1 {
    //main method
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);
        set.add(38);
        set.add(9);
        //Enhanced for loop.
        for(Integer yam : set) {
            System.out.println(yam);
        }
    }
}
/*OUTPUT:kyuki TreeSet type-safe class h,or humne type-safe declare kia h angular brackets<> k andar Integer type
         ka isley hum kewal Integer records store kr paye,or heterogenous records waise bhi TreeSet m allowed ni
         hote,lekin kyuki type-safe declare kia h,isley loop m Integer class var. bana paye,or isley warning bhi
         nhi aai compile krne pr.agar type-safe declare nhi krte to fir loop m Object var. banake iterate krna 
         padta.
4
9
19
23
38
41
56 */