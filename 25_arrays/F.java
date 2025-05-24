class F {
    public static void main(String[] args) {
        int[] x = new int[0]; //created 1d array of zero length

        int[][] y = new int[2][]; //created 2d outer array of length 2

        System.out.println(x instanceof int[]); //true

        System.out.println(x instanceof int[][]); //false

        System.out.println(y instanceof int[]); //false

        System.out.println(y instanceof int[][]); //true
    }
}

/*instanceof operator compile time par hi type compatibility check karta hai.

this code demonstrates that In Java, arrays are also objects, and each array type (like int[], int[][], etc.) is a distinct type on its own.
OUTPUT
PS D:\github_repos\javapractice\25_arrays> javac F.java
F.java:9: error: incompatible types: int[] cannot be converted to int[][]
        System.out.println(x instanceof int[][]);
                           ^
F.java:11: error: incompatible types: int[][] cannot be converted to int[]
        System.out.println(y instanceof int[]);
                           ^
2 errors
 */