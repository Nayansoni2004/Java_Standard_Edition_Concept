class L {
    public static void main(String[] args) {
        // 2D array with 2 rows and 4 columns; outer array has size 2, each inner array has size 4
        int[][] x = new int[2][4]; //first bracket shows outer array size and second bracket shows inner 1d arrays sizes.

        System.out.println("Length of 2D Array Object(x.length): " + x.length); //

        System.out.println("Length of First 1D Array Object(x[0].length): " + x[0].length);

        System.out.println("Length of Second 1D Array Object(x[1].length): " + x[1].length);
    }
}
/* OUTPUT
Length of 2D Array Object(x.length): 2
Length of First 1D Array Object(x[0].length): 4
Length of Second 1D Array Object(x[1].length): 4
 */