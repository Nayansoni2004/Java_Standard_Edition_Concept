import java.util.ArrayList;
class A1 {
    //main method
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(13);
        x.add(15);
        x.add(21);
        x.add(9);

        Object[] arr = x.toArray();//ye method ArrayList ko Array m convert kr deta h,or return arr(array) of Object krta h.
        //Iterating array of Object through Enhanced for loop.
        for(Object obj : arr) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
        System.out.println(arr[3].intValue());//<-Returns the value of the specified number as an int,returnType int.
        System.out.println(arr[4]);

       // System.out.println(arr.get(0));//error:cannot find symbol bec. get()<-method Array m nhi h ArrayList m h.
    }
}
/*OUTPUT:line 26 get()<-method ka output,error kyuki Array pe hum get()<-method call nhi kr sakte,Array m
         property hoti h length.
D:\javaprac\37_collection_framework\12_ArrayListToArrayConvert>javac A1.java
A1.java:26: error: cannot find symbol
        System.out.println(arr.get(0));//error:cannot find symbol bec. get()<-method Array m nhi h ArrayList m h.
                              ^
  symbol:   method get(int)
  location: variable arr of type Object[]
1 error */

/*OUTPUT:line 25 pe error aaya kyuki hum array of Object k elements ko print kr ry h,or intValue()<-method
         Object class m nhi h,to error aayega cannot find symbol,kyuki java class Object m dekhega ki koi 
         intValue()method h kya? intValue()method class Number m h,jo ki direct child h class Object ka.to 
         error aayega,bec. intValue()method is in class Number.
D:\javaprac\37_collection_framework\12_ArrayListToArrayConvert>javac A1.java
A1.java:25: error: cannot find symbol
        System.out.println(arr[3].intValue());
                                 ^
  symbol:   method intValue()
  location: class Object
1 error */