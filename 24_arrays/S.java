class S {
    public static void main(String[] args) {
        int[][] x = new int[2][]; //created 2d array (size 2) and didn't initialized 1d(inner) arrays 

        x[0] = new int[3]; //1d array initialization
        x[1] = new int[5]; //1d array initialization

        for(int i = 0 ; i < x.length ; i++) {
            for(int j = 0 ; j < x[i].length ; j++) { // here x[i] will not give null..
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
     }
}
/* if size of 1d(inner) arrays is not given at declaration(line) of 2d array object then, we can initialize later
   & its advantage is that 1d arrays can also be made of different lengths. 
OUTPUT:
0 0 0 <-(inner 1d array of size 3)
0 0 0 0 0 <-(inner 1d array of size 5)
 */