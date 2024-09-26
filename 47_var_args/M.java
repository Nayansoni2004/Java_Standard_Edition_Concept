class M {
    static void pro(String y, int... x) {
        System.out.println(y);
        //iterating array of int through Enhanced-for loop.
        for(int t : x) 
            System.out.println(t);
    }

    //main method
    public static void main(String[] args) {
        pro("mohan", 12, 13, 14);
    } 
}
/*OUTPUT:
D:\javaprac\47_var_args>javac M.java

D:\javaprac\47_var_args>java M
mohan
12
13
14
 */