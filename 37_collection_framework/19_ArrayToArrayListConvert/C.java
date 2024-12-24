import java.util.Arrays;
import java.util.List;
class C {
    //main method
    public static void main(String... args) {
        Integer[] x = {78 , 12 , 62 , 54 , 39};//wrapper class Integer array banaya,kyuki primitive type not allowed in CollectionFramework.

        //backed list
        List<Integer> list = Arrays.asList(x);//<-asList()<-method array ko ArrayList m convert kr deti h,or <type-Safe> List return krti h.

        //Iterating Array using Enhanced forLoop.
        for(Integer rec : x) {
            System.out.print(rec + " ");
        }

        System.out.println();//1 line ka gap bhi de dena
        list.set(1 , 111);//set()<-method replace kr deta h

        //Iterating Array using Enhanced forLoop
        for(Integer rec : x) {
            System.out.print(rec + " ");
        }
    }
}
/*OUTPUT:
78 12 62 54 39 <-Array.
78 111 62 54 39 <-Array k index 1 pe change ho gaya,jubki hum ne ArrayList m change kia tha.*/