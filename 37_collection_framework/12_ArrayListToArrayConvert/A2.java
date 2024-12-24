import java.util.ArrayList;
class A2 {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Object[] arr = x.toArray();//<-toArray()method ArrayList ko Array m convert kr deta h or array of Object return krta h.
        //Iterating array of type Object using Enhanced for-loop.
        for(Object obj : arr) {
            System.out.println(obj);
        }
        System.out.println();
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(((Integer)arr[3]).intValue());/*pahle humne arr[3] ko wrapper class Integer m (type- 
                                                           cast) kr dia h,or kyuki Integer class m intValue()method
                                                           h or Integer obj. pr call ho rhi h to kr sakte h legal h.*/
        System.out.println(arr[4]);
        
       // System.out.println(arr.get(0));
    }
}
/*OUTPUT:line 26 get()<-method ka output,error kyuki Array pe hum get()<-method call nhi kr sakte,Array m
         property hoti h length,or get(int index)<-method to ArrayList ki method h.
D:\javaprac\37_collection_framework\12_ArrayListToArrayConvert>javac A2.java
A2.java:28: error: cannot find symbol
        System.out.println(arr.get(0));
                              ^
  symbol:   method get(int)
  location: variable arr of type Object[]
1 error */

/*OUTPUT:line no. 23 ka output,kyuki humne Object ko wrapper class Integer obj. m type-cast kr dia h,to hum 
         intValue()<-method Integer obj. pe call kr sakte h,kyuki pahle Object class m intValue()method nhi thi
         to hum call nhi kr pa rhe the,pr type-cast krne k baad call kr pa rhe h kyuki intValue()method wrapper
         class Integer m class Number se inherited h.
12
13
15
21
9

12
13
15
21
9 */