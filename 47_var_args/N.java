class N {
    static void pro(String... y, int... x) {
        System.out.println(y);

        System.out.println(x.length);
    }

    //main method
    public static void main(String[] args) {
        pro("om" , "ram" , "raj" , 12, 45, 78);
    }
}
/*OUTPUT:var_args method ya constructor ki parameter body ka last parameter hona chahiye or method() ya constructor
         ()<-m ik hi var_args bana sakte h,multiple var_args ik hi method ki parameter body m nhi bana sakte.

         D:\javaprac\47_var_args>javac N.java
N.java:2: error: varargs parameter must be the last parameter
    static void pro(String... y, int... x) {
                              ^
1 error
 */