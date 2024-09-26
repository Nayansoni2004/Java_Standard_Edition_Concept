class B {
    void pro(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    //main method
    public static void main(String[] args) {
        B b = new B();

        int[] x = {4 , 5};

        b.pro(x);
    }
}
/*OUTPUT:error kyuki required the do integer hum de rhe h array of integer.
D:\javaprac\47_var_args>javac B.java
B.java:13: error: method pro in class B cannot be applied to given types;
        b.pro(x);
         ^
  required: int,int
  found:    int[]
  reason: actual and formal argument lists differ in length
1 error
 */