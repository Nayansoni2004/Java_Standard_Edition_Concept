import java.util.List;
import java.util.Arrays;
class A {
    //main method
    public static void main(String... args) {
        Integer[] x = {78 , 12 , 62 , 54 , 39};//wrapper class Integer ka array banaya,bec. primitive-type not allowed in CollectionFramework. 

        List<Integer> list = Arrays.asList(x);/*<-asList(x)method array ko ArrayList m convert kr dega,or 
                                                <type-safe>List return krega.*/

        System.out.println(list);//is line pe Integer array nhi ArrayList print hoga.
    }
}
/*OUTPUT:[78, 12, 62, 54, 39] <-ArrayList print hua,kyuki sub-script bracket k andar h elements.*/