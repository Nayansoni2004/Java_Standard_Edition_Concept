import java.util.Arrays;
class F {
    //main method
    public static void main(String[] args) {
        String[] x = {"samyak" , "hitesh" , "vikas" , "ganesh" , "manoj"};

        Arrays.sort(x);//<-list pass kr do sort kr deta h.
        
        //Iterating sorted array of String obj. through Enhanced-forLoop.
        for(String next : x) {
            System.out.print(next + " ");
        }

        System.out.println();//1 line ka gap dia h.

        String str = new String("hitesh");
        //String str = new String("naman");//<-formula used: ((-insertion_point) -1)

        System.out.println(Arrays.binarySearch(x , str));//array or key pass kr do,<-returnType int(i.e.Search index).
    }
}
/*OUTPUT:
ganesh hitesh manoj samyak vikas //<-sorted array of String.
1 <-hitesh lies at Search index 1. */

/*OUTPUT: 
ganesh hitesh manoj samyak vikas
-4 <-agar naman list m hota to Search index -4 pe hota. */