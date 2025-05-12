class N1 {
    public static void main(String[] args) {
        int[][] x = new int[2][4];

        for(int i = 0 ; i < x.length ; i++) {
            // System.out.println(x[i]); 
            System.out.println(x[i].length); //length is a property in array, not a method.
        }
    }
}
/* OUTPUT: printed lengths of inner 1d arrays inside 2d array object.
4
4
 */
