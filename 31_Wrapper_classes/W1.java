class W1 {
    //main method
    public static void main(String[] args) {
        double a = 3.4;

        String x = a.toString();

        System.out.println(x);
    }
}
/*OUTPUT: W1.java:6: error: double cannot be dereferenced
        String x = a.toString();
        ^
1 error
*/