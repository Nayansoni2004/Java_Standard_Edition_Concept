class G {
    public static void main(String[] args) {
        int[] x = new int[0]; //created 1d array of size 0

        int[][] y = new int[2][];//created 2d array of size 2
        
        System.out.println(x instanceof Object);
        System.out.println(y instanceof Object);
    }
}
/*
Both x and y are arrays, and in Java, every array is an object, regardless of its data type or dimensions.
So:
x is a 1D array → it's an object → x instanceof Object → true
y is a 2D array → still an object → y instanceof Object → true
Hence, output is true true.

OUTPUT
true
true
 */