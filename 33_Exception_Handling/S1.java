class S1 {
    //main method
    public static void main(String[] args) {

        try {
            String x = "rohan";

            System.out.println(x.charAt(100));

            int[] y = {12 , 45 , 76};
            System.out.println(y[3]);

        } catch(ArrayIndexOutOfBoundsException | IndexOutOfBoundsException e) {

            System.out.println("-------------------------");

            e.printStackTrace();
        }
    }
}
/*OUTPUT: illegal Concept kyuki pipe laga k nhi likh sakte or child ko phale mauka milega lekin apan ne String
var. x liya h to StringIndexOutOfBoundsException generate hoga or child ArrayIndexOutOfBoundsException likha h,
isley error aayegi,or ye java allow nhi krta h!!!

D:\javaprac\33_Exception_Handling>javac S1.java
S1.java:13: error: Alternatives in a multi-catch statement cannot be related by subclassing
        } catch(ArrayIndexOutOfBoundsException | IndexOutOfBoundsException e) {
                                                 ^
  Alternative ArrayIndexOutOfBoundsException is a subclass of alternative IndexOutOfBoundsException
1 error
 */