class U {
    public static void main(String[] args) {
        //super shortcut technique of 2d array declaration cum instantiation cum initialization on single line..
        int[][] x = {{4, 9, 12, 2, 21}, {11, 23, -3}, {7, 1, 8, 6, 3, 0, 13}, {'A', 'B', 'C'}};//size of 2d(outer) array is 4 and inner(1d arrays have different sizes)

        for(int i = 0 ; i < x.length ; i++) {
            for(int j = 0 ; j < x[i].length ; j++) { //here x[i] gives (inner)1d arrays
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/* created 2d array using super shortcut technique on single line in which instantiation will be done by compiler
   using new keyword & bec. array is of type int which has inner 1d arrays of different datatypes(char) so char will
   be converted into int and printing its elements will print the int values.
OUTPUT
4 9 12 2 21 
11 23 -3 
7 1 8 6 3 0 13 
65 66 67 <- char is automatically converted into int values (A, B, C)
 */