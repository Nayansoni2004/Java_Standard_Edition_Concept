class G {
    static void pro(int... x) {
        //iterating array of primitive type int through enhanced for-loop.
        for(int next : x) 
            System.out.println(next);
    }

    //main method
    public static void main(String[] args) {
        byte a = 23;
        short b = 56;
        char c = 'A';

        pro(a, b, c);
    }
}
/*OUTPUT:
D:\javaprac\47_var_args>javac G.java

D:\javaprac\47_var_args>java G
23
56
65
 */