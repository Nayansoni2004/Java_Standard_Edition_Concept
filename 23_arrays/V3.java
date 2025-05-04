class V3 {
    public static void main(String[] args) {
        double[] x = new float[4]; // one primitive type array can not be assigned into another primitive type array.

    }
}

/*ERROR
V3.java:3: error: incompatible types: float[] cannot be converted to double[]
        double[] x = new float[4]; // one primitive type array can not be assigned into another primitive type array.
                     ^
1 error
 */
