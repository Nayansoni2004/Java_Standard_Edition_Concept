class R1 {
    //main method
    public static void main(String[] args) {

        try {
            String x = "rohan";

            System.out.println(x.charAt(100));

            int[] y = {12 , 45 , 76};
            System.out.println(y[3]);

        } catch(ArrayIndexOutOfBoundsException e) {
            
            System.out.println("~~~~~~~~~~~~~~~~");
            e.printStackTrace();
        } catch(IndexOutOfBoundsException e) {

            System.out.println("****************");
            e.printStackTrace();
        }
    }
}
/*OUTPUT: acc. to rule agar try block m koi exception generate hota h or uske liye multiple catch block banaye 
gye h,or catch block k bich parent child relationship h to pahle chance child ko milta h,lekin is example m 
IndexOutOfBoundsException ko chance mila jo ki parent h,kyuki apan ne String var. liya h or ArrayIndexOutOfBounds
Exception String k liye appropriate catch block nhi h,or kyuki IndexOutOfBoundsException StringIndexOutOfBounds
Exception or ArrayIndexOutOfBoundsException dono ka parent h isley yaha IndexOutOfBoundsException ko chance mila
or run hua!
 
D:\javaprac\33_Exception_Handling>java R1
****************
java.lang.StringIndexOutOfBoundsException: String index out of range: 100
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
        at java.base/java.lang.String.charAt(String.java:1519)
        at R1.main(R1.java:8)
 */