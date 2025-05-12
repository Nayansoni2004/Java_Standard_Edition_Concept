class P {
    public static void main(String[] args) {
        String[][] m = new String[3][2]; //[3]outer array size, [2]inner 1d arrays size.

        for(int c = 0 ; c < m.length ; c++) {
            for(int k = 0 ; k < m[c].length ; k++) {
                System.out.print(m[c][k] + " ");
            }
            System.out.println();
        }

    }
}
/* OUTPUT: printed bydefault initialized values at indexes of each inner 1d array objects inside 2d outer array of
           type (String) using nested for loop.
null null 
null null
null null
 */