class R {
    static void pro(String[][] w) {
        //iterating one-d. array of type String through Enhanced-for loop.
        for(String[] nx : w) {
            //iterating array of type String through Enhanced for-loop.
            for(String next : nx) {
                System.out.print(next + " ");
            }
            System.out.println();
        }
    }

    //main method
    public static void main(String[] args) {
        String[][] arr = {{"a", "b", "c", "d"}, {"x", "y", "z"}};

        pro(arr);
    }
}
/*OUTPUT:two-d array of String k elements ko Enhanced for-loop k through print kia h.
D:\javaprac\47_var_args>javac R.java

D:\javaprac\47_var_args>java R
a b c d
x y z
 */