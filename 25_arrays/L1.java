// concept: reverse the 1d array x & store its elements in array y.
class L1 {
    public static void main(String[] args) {
        int[] x = {23, 56, 78, 12, 9}; //super-shortcut technique to declare & instantiate an array

        int[] y = new int[x.length];

        //printing empty 1d array y
        for(int w : y) {
            System.out.print(w + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //here \n takes the code to the nextline then prints the decorative line ~~~~~~~

        // x array reversing logic & assigning elements in y array
        for(int i = 0 ; i < x.length ; i++) {
            y[i] = x[x.length-i-1]; 
        }

        //again printing y array elements
        for(int w : y) {
            System.out.print(w + " ");
        }
    }
}
/*OUTPUT
0 0 0 0 0 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
9 12 78 56 23
 */