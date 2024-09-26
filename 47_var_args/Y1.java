class Y1 {
    static void pro(Integer... x) {
        //iterating var_args of type Integer through Enhanced for loop.
        for(Integer nx : x)
            System.out.print(nx + " $");
    }

   /* static void pro(int... x) {
        //iterating var_args of primitive type int through Enhanced for-loop.
        for(int next : x) 
            System.out.print(next + " *");
    } */

    //main method
    public static void main(String[] args) {
        pro(45, 67, 89);
    }
}
/*OUTPUT:legal code h kyuki humne method m direct array bana k pas kia h to compiler ellipsis dekhte hi internally
         array of wrapper class Integer create kr lega or ik ik elements ko print kr dega.
        
D:\javaprac\47_var_args>javac Y1.java

D:\javaprac\47_var_args>java Y1
45 $67 $89 $
 */