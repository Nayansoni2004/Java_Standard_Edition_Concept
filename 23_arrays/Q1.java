class Q1 {
    public static void main(String[] args) {
        long l = 45L;
        float f = 2.3f;
        double d = 4.45;

        int x;

        x = l;
        x = f;
        x = d;
    }
}
/* narrowing conversion of datatypes is not implicit done by the compiler(means long, float, double are larger datatypes
   and assigning them into lower int(standard datatype) needs explicit conversion by the programmer).
ERROR
Q1.java:9: error: incompatible types: possible lossy conversion from long to int
        x = l;
            ^
Q1.java:10: error: incompatible types: possible lossy conversion from float to int
        x = f;
            ^
Q1.java:11: error: incompatible types: possible lossy conversion from double to int
        x = d;
            ^
3 errors
 */