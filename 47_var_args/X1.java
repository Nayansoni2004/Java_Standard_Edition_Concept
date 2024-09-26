class X1 {
    static void pro(Integer... x) {
        //iterating var_args of Integer through Enhanced for-Loop.
        for(Integer nx : x) 
            System.out.print(nx + " $");
    }

    //main method
    public static void main(String[] args) {
        int[] arr = {12, 13, 56};

        pro(arr);
    }
}
/*OUTPUT:
D:\javaprac\47_var_args>javac X1.java
X1.java:12: error: method pro in class X1 cannot be applied to given types;
        pro(arr);
        ^
  required: Integer[]
  found:    int[]
  reason: varargs mismatch; int[] cannot be converted to Integer
1 error
 */