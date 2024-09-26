class X2 {
    static void pro(int... x) {
        //iterating var_args of primitive type int through Enhanced for loop
        for(int next : x)
            System.out.print(next + " *");
    }

    //main method
    public static void main(String[] args) {
        Integer[] arr = {12, 13, 14};

        pro(arr);
    }
}
/*OUTPUT:
D:\javaprac\47_var_args>javac X2.java
X2.java:12: error: method pro in class X2 cannot be applied to given types;
        pro(arr);
        ^
  required: int[]
  found:    Integer[]
  reason: varargs mismatch; Integer[] cannot be converted to int
1 error
 */