class Q2 {
    public static void main(String[] args) {
        long l = 45L;
        float f = 2.4f;
        double d = 3.7;

        int x;

        x = (int)l; //narrowing conversion of datatypes.
        System.out.println(x);

        x = (int)f;
        System.out.println(x);

        x = (int)d;
        System.out.println(x);
    }
}
/* when assinging larger datatypes (long, float, double) into lower datatype(int), explicit conversion is needed.
OUTPUT
45
2
3
 */