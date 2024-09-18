class S {
    //main method
    public static void main(String[] args) {

        try {
            String x = "sohan";

            System.out.println(x.charAt(100));

            int[] y = {12 , 45 , 76};
            System.out.println(y[3]);
            
        } catch(IndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {

            System.out.println("~~~~~~~~~~~~~~~~~~~");
            e.printStackTrace();
        }
    }
}
/*OUTPUT: pipe laga k nhi likh sakte kyuki ArrayIndexOutOfBoundsException child h parent class IndexOutOfBounds
Exception ka or child ko pahle mauka milta h,lekin StringIndexOutOfBoundsException bhi child h IndexOutOfBounds
Exception ka ,but pipe laga k nhi likh sakte,java allow nhi krta h.

D:\javaprac\33_Exception_Handling>javac S.java
S.java:12: error: Alternatives in a multi-catch statement cannot be related by subclassing
        } catch(IndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
                                            ^
  Alternative ArrayIndexOutOfBoundsException is a subclass of alternative IndexOutOfBoundsException
1 error
 */