class F1 {
    static void pro(int... x) {
        System.out.println(x.length);
    }

    //main method
    public static void main(String[] args) {
        byte x1 = 34;
        byte x2 = 67;

        byte[] a = {x1, x2};

        pro(a);
    }
}
/*OUTPUT: array of primitive type int m array of byte assign nhi kr sakte,kewal class type m allowed h.isley
          error aayega.

D:\javaprac\47_var_args>javac F1.java
F1.java:13: error: method pro in class F1 cannot be applied to given types;
        pro(a);
        ^
  required: int[]
  found:    byte[]
  reason: varargs mismatch; byte[] cannot be converted to int
1 error
 */