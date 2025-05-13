class R {
    public static void main(String[] args) {
        int[][] x = new int[2][]; //created 2d array size 2 and not initialized 1d inner arrays...

        for(int i = 0 ; i < x.length ; i++) {
            for(int j = 0 ; j < x[i].length ; j++) { //x[i] is null no 1d object initialized...
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/* Exception at runtime because x[i].length will give null bec. no array is initialized at that index.
PS D:\github_repos\javapractice\24_arrays> java R
Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local1>[<local2>]" is null
        at R.main(R.java:6)
 */