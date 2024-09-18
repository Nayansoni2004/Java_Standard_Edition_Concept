import java.io.FileNotFoundException;

class O {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(3);
    }
}
/*OUTPUT: error aayi kyuki jo hum throw kr sakte h try block m se,wahi catch kr sakte h catch block m,lekin jo 
throw nhi kr sakte wo catch bhi nhi kr sakte, or hum FileNotFoundException throw nhi kr sakte,lekin catch kr rhe
h isley error aai!
O.java:10: error: exception FileNotFoundException is never thrown in body of corresponding try statement
        } catch(FileNotFoundException e) {
          ^
1 error
 */