class U {
    static void pro(String...[] w) {
        //iterating 2d var_args though Enhanced for loop.
        for(String[] nx : w) {
            //iterating 1d array though Enhanced for loop.
            for(String next : nx) {
                System.out.println(next + "- ");
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
/*CONCLUSION:var_args should be the last argument in method or constructor parameter body.means var_args k baad
             parameter body m normal variables nhi bana sakte.
OUTPUT:
D:\javaprac\47_var_args>javac U.java
U.java:2: error: <identifier> expected
    static void pro(String...[] w) {
                             ^
U.java:2: error: ',', ')', or '[' expected
    static void pro(String...[] w) {
                               ^
2 errors
 */