class A {
    public static void main(String[] args) {
        int[] x = {10, 51, 17, 23, 43}; //super shortcut technique: array declaration cum instantiation cum initialization. 

        int[] y = new int[x.length];

        //printing elements of y(array)
        for(int i = 0 ; i < y.length ; i++) {
            System.out.println(y[i]);
        }

        //assigning elements of x(array) into y(array)
        for(int i = 0 ; i < x.length ; i++) {
            y[i] = x[i];
        }

        System.out.println("#############################");

        //printing elements of y(array) again
        for(int i = 0 ; i < y.length ; i++) {
            System.out.println(y[i]);
        }
    }
}
/* read the records of array(x) and assigned its elements (in the same corresponding index) into the array(y) and
  printed the elements of y.
OUTPUT
0
0
0
0
0
#############################
10
51
17
23
43
 */