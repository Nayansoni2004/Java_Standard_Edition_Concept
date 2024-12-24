import java.util.Arrays;
import java.util.List;
class D {
    //main method
    public static void main(String... args) {
        Integer[] x = {78 , 12 , 62 , 54 , 39};//wrapper class Integer ka array banaya,kyuki primitive type collectionFramework m allowed nhi h.

        //backed list
        List<Integer> list = Arrays.asList(x);//<-Integer array ko ArrayList m convert kr degi.

        list.add(99);/*Array se ArrayList back-to-back connected h,isley hum add yr delete operation perform
                        nhi kr sakte,kewal existing element pe replace kr sakte h.*/
    }
}
/*OUTPUT:
Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.AbstractList.add(AbstractList.java:153)
        at java.base/java.util.AbstractList.add(AbstractList.java:111)
        at D.main(D.java:11) */