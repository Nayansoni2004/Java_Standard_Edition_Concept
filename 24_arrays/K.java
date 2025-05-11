class K {
    public static void main(String[] args) {
        int[][] x = new int[2][3]; //2d array declaration cum instantiation cum initialization

        System.out.println("2D Array Ref. Var.(x): " + x);

        System.out.println("First 1D Array Ref. Var. x[0]: " + x[0]);

        System.out.println("Second 1D Array Ref. Var. x[1]: " + x[1]);
    }
}
/* OUTPUT: printed ref. code of 2d array object and 1d array object inside it.
2D Array Ref. Var.(x): [[I@1218025c
First 1D Array Ref. Var. x[0]: [I@87aac27
Second 1D Array Ref. Var. x[1]: [I@3e3abc88
 */