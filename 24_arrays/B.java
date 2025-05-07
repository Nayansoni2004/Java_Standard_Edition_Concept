class B {
    public static void main(String[] args) {
        int[] y = {10, 51, 17, 23, 43}; //super shortcut technique: array declaration cum instantiation cum initialization. 

        // for(int i = 0 ; i < y.length ; i++) {
        //     System.out.println(y[i]);
        // }

        // Enhanced for loop or for-each loop
        for(int next : y) {
            System.out.println(next);
        }
    }
}
/* printed elements of array(y) using enhanced for loop(for-each loop).
OUTPUT
10
51
17
23
43
 */