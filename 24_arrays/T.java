class T {
    public static void main(String[] args) {
        // shortcut technique of 2d array declaration cum instantiation cum initialization on the same line...
        int[][] x = new int[][] {{4, 9, 12, 2}, {11, 23}, {7, 1, 8, 6, 3}}; //size of 2d(outer)array is 3 which has (inner)1d arrays of different sizes.
        
        for(int i = 0 ; i < x.length ; i++) {
            for(int j = 0 ; j < x[i].length ; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/* concept: created 2d array using shortcut technique(array declaration cum instantiation cum initialization) in
            a single line and also printed elements of 1d(inner arrays) using nested for loop.
OUTPUT
4 9 12 2 
11 23 
7 1 8 6 3
 */