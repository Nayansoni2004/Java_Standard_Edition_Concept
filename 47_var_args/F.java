class F {
    //main method
    public static void main(String[] args) {
        //int[] x = new byte[2];

        byte a = 89;

        int b = a;
    }
}
/*OUTPUT:error:kyuki array of int me array of byte assign nhi kr sakte,bec. acc. to rule array primitive type m
         declaration side pr jo array type declared h wahi instantiation side pr hona chahiye,lekin array of 
         class type m allowed h.

D:\javaprac\47_var_args>javac F.java
F.java:4: error: incompatible types: byte[] cannot be converted to int[]
        int[] x = new byte[2];
                  ^
1 error
 */