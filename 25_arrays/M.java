// concept: another logic to reverse the x array & store its elements in y array
class M {
    public static void main(String[] args) {
        int[] x = {23, 56, 78, 12, 9, 55, 34, 97}; //super-shortcut technique

        int[] y = new int[x.length]; //created y array of same length

        //printing empty array y
        for(int w : y) {
            System.out.print(w + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //line separator

        //reversing logic while assigning in y array
        for(int i = x.length-1 ; i >= 0 ; i--) {
            y[i] = x[x.length-i-1];
        }

        //printing y array again
        for(int w : y) {
            System.out.print(w + " ");
        }
    }
}
/*OUTPUT
0 0 0 0 0 0 0 0 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~
97 34 55 9 12 78 56 23
 */