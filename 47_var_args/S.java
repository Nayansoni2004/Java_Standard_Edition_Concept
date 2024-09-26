class S {
    static void pro(String[]... w) {
        //iterating two-d array of String through Enhanced for-loop.
        for(String[] next : w) {
            //iterating one-d array of String through Enhanced for loop.
            for(String x : next) {
                System.out.print(x + "- ");
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
/*OUTPUT:2-d array of String bana k pro()<-m pass kia h or pro()<-k parameters m 1-d array ko access kia h or
         dusre 1-d array ko var_args pe chod dia h,to var_args bhi 1-d array jese kam krega.
D:\javaprac\47_var_args>javac S.java

D:\javaprac\47_var_args>java S
a- b- c- d-
x- y- z-
 */