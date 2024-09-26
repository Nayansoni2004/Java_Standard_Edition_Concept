class A {
    void pro(int a , int b) {
        System.out.println(a);
        System.out.println(b);
    }

    //main method
    public static void main(String[] args) {
        A a = new A();

        a.pro();
    } 
}
/*OUTPUT: required two arguments found no-arguments isley compilation fail ho jayega.
D:\javaprac\47_var_args>javac A.java
A.java:11: error: method pro in class A cannot be applied to given types;
        a.pro();
         ^
  required: int,int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
 */