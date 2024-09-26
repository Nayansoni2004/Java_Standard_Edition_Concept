class M2 {
    static void pro(String y, int... x) {
        System.out.println(y);

        System.out.println(x.length);
    }

    //main method
    public static void main(String[] args) {
        pro(12, 45, 78);
    }
}
/*OUTPUT: var-args m array bana k pass nhi krenge to chalge kyuki compiler ellipsis(...) ka sign dekh kr zero 
          length ka array internally create kr lega lekin normal parameter var_args ki tarah kam nhi krta h, us
          me to argument pass krna hi padta h.
D:\javaprac\47_var_args>javac M2.java
M2.java:10: error: incompatible types: int cannot be converted to String
        pro(12, 45, 78);
            ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
 */