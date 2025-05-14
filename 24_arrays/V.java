class V {
    public static void main(String[] args) {
        //shortcut technique of 2d array declaration cum instantiation cum initialization
        int[][] x = new int[][] {   {4, 9, 12, 2}, {11, 23}, {7, 1, 8, 6, 3}   };//size of 2d(outer)array is 3 & inner(1d arrays) have different sizes/

        //enhanced for loop
        for(int[] t : x) {
            for(int s : t) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
/* created 2d array using shortcut technique & (inner)1d arrays which has different lengths, & accessed 2d aaray
   and printed elements of 1d(inner) arrays using enhanced for loop(for-each loop), optimized code.
OUTPUT
4 9 12 2 
11 23 
7 1 8 6 3 
 */