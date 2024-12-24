import java.util.Arrays;
import java.util.List;
class B {
    //main method
    public static void main(String... args) {
        Integer[] x = {78 , 12 , 62 , 54 , 39};//wrapper class Integer array banaya,kyuki primitive type not allowed in CollectionFramework.

        //backed-list
        List<Integer> list = Arrays.asList(x);//<-asList()<-method array ko ArrayList m convert kr deti h,or <type-Safe> List return krti h.

        System.out.println(list);//ArrayList print hogi,array nhi,kyuki Integer array ko ArrayList m convert kr dia h.

        x[2] = 99;/*back-to-back connected h array se ArrayList isley hum element add ya delete nhi kr sakte,
                    lekin existing element ko new element se replace kr sakte h.*/

        System.out.println(list);//<-is bar ArrayList jub print hogi to 62 ki jagah 99 print hoga.
    }
}
/*OUTPUT:
[78, 12, 62, 54, 39] <-Array.
[78, 12, 99, 54, 39] <-ArrayList.*/