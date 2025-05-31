// concept: reversed array x elements and assigned into y array using extra variable.
class N {
    public static void main(String[] args) {
        int[] x = {23, 56, 78, 12, 9, 55, 1};//super short-cut technique

        int[] y = new int[x.length];//created y array of same size

        //printing empty array y
        for(int w : y) {
            System.out.print(w + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//line separator

        //assigning elements of x array in reverse order into y array
        for(int i = 0, j = x.length-1 ; j >= 0 ; i++, j--) {
            y[j] = x[i];//insertion from last index of y array
        }

        //printing elements of y arr
        for(int w : y) {
            System.out.print(w + " ");
        }
    }    
}
/*OUTPUT
0 0 0 0 0 0 0 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1 55 9 12 78 56 23
 */