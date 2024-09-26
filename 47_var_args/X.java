class X {
    static void pro(Integer... x) {
        //iterating var_args of Integer through Enhanced for loop.
        for(Integer nx : x)
            System.out.print(nx + " $");
    }

    static void pro(int... x) {
        //iterating var_args of primitive type int through Enhanced-for loop.
        for(int next : x)
            System.out.print(next + " *");
    }

    //main method
    public static void main(String[] args) {
        //int[] arr = {12, 34, 56}; //<-primitive var_args bala method version run hoga.
        Integer[] arr = {12, 13, 14};//<-wrapper class Integer wala method version run hoga.

        pro(arr);
    }
}
/*OUTPUT:
D:\javaprac\47_var_args>java X
12 *34 *56 *
D:\javaprac\47_var_args>javac X.java

D:\javaprac\47_var_args>java X
12 $13 $14 $
 */