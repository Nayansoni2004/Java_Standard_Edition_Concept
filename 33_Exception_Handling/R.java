class R {
    //main method
    public static void main(String[] args) {
        
        try {
            String x = "rohan";

            System.out.println(x.charAt(100));

            int[] y = {12 , 45 , 76};

            System.out.println(y[3]);
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
/*OUTPUT:error aai kyuki ArrayIndexOutOfBoundsException child h parent IndexOutOfBoundsException ka,isley child 
ko pahle likhna padta h ,kyuki child ko pahle mauka milega according to rule.

D:\javaprac\33_Exception_Handling>javac R.java
R.java:15: error: exception ArrayIndexOutOfBoundsException has already been caught
        } catch(ArrayIndexOutOfBoundsException e) {
          ^
1 error
 */