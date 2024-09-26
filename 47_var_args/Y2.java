class Y2 {
   /* static void pro(Integer... x) {
        //iterating var_args of type Integer through Enhanced for-loop.
        for(Integer nx : x) 
            System.out.println(nx + " $");
    } */

    static void pro(int... x) {
        //iterating var_args of primtive type int through Enhanced for-loop.
        for(int next : x) 
            System.out.println(next + " *");
    }

    //main method
    public static void main(String[] args) {
        pro(45, 67, 89);
    }
}
/*OUTPUT: legal kyuki humne method calling m direct array bana k pass kia h to compiler var_args dekhte hi 
          internally array of primitive type int create kr lega or elements print kr dega,kyuki method version 
          int parameterized hi available h.

D:\javaprac\47_var_args>javac Y2.java

D:\javaprac\47_var_args>java Y2
45 *
67 *
89 *
 */