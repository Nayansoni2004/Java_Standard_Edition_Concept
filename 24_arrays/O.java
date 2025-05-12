class O {
    public static void main(String[] args) {
        int[][] x = new int[2][4]; //2d array declaration cum instantiation

        for(int i = 0 ; i < x.length ; i++) {
            for(int j = 0 ; j < x[i].length ; j++) {
                System.out.print(x[i][j] + " "); //here at x[i] we get inner 1d array object
            }
            System.out.println();
        }

    }
}
/* OUTPUT: printed bydefault initialized values at indexes of each inner 1d array objects inside 2d outer array
            using nested for loop.
0 0 0 0 
0 0 0 0  
 */