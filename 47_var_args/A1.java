class A1 {
    void pro(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    //main method
    public static void main(String[] args) {
        A1 a = new A1();

        a.pro(23);
    }
}
/*OUTPUT: required two arguments found 1 argument isley again compilation fail ho jayega.

D:\javaprac\47_var_args>javac A1.java
A1.java:11: error: method pro in class A1 cannot be applied to given types;
        a.pro(23);
         ^
  required: int,int
  found:    int
  reason: actual and formal argument lists differ in length
1 error
 */