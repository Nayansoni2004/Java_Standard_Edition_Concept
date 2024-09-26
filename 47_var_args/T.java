class T {
    static void pro(String...... w) {
        //iterating 2d var_args of String through Enhanced for loop.
        for(String[] next : w) {
            //iterating 1d var_args of String through Enhanced for-loop.
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
/*CONCLUSION:var_args ka use kr k 2-d array nhi bana sakte,compilation fail ho jayega.means six dots ka use krke
             ellipsis(......)<-nhi bana sakte.
OUTPUT: 
D:\javaprac\47_var_args>javac T.java
T.java:2: error: <identifier> expected
    static void pro(String...... w) {
                             ^
1 error
 */