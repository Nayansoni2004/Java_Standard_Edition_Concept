class M {
    public static void main(String[] args) {
        int[][] x = new int[2][4]; //size 2 is of 2d array length, & size 4 is 1d inner arrays length

        System.out.println("1st Int Var. of 1st Array Object=> x[0][0]: " + x[0][0]); //1st int var. of 1d inner array
        System.out.println("2nd Int Var. of 1st Array Object=> x[0][1]: " + x[0][1]);
        System.out.println("3rd Int Var. of 1st Array Object=> x[0][2]: " + x[0][2]);
        System.out.println("4th Int Var. of 1st Array Object=> x[0][3]: " + x[0][3]);

        System.out.println("####################################################");

        System.out.println("1st Int Var. of 2nd Array Object=> x[1][0]: " + x[1][0]); //1st int var. of 1d inner array
        System.out.println("2nd Int Var. of 2nd Array Object=> x[1][1]: " + x[1][1]);
        System.out.println("3rd Int Var. of 2nd Array Object=> x[1][2]: " + x[1][2]);
        System.out.println("4th Int Var. of 2nd Array Object=> x[1][3]: " + x[1][3]);
    }
}
/*OUTPUT: printed elements of 1d inner array, bydefault the indexes gets initialized by zero values if array type is int.
1st Int Var. of 1st Array Object=> x[0][0]: 0
2nd Int Var. of 1st Array Object=> x[0][1]: 0
3rd Int Var. of 1st Array Object=> x[0][2]: 0
4th Int Var. of 1st Array Object=> x[0][3]: 0
####################################################
1st Int Var. of 2nd Array Object=> x[1][0]: 0
2nd Int Var. of 2nd Array Object=> x[1][1]: 0
3rd Int Var. of 2nd Array Object=> x[1][2]: 0
4th Int Var. of 2nd Array Object=> x[1][3]: 0
 */