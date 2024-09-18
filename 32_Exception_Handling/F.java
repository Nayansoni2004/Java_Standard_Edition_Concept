class F {
    //main method
    public static void main(String[] args) {
        System.out.println(1);

        String x = null;

        try {
            System.out.println(x.length());
        } catch(NullPointerException e) {
            System.out.println("Problem Solved.");
        }

        System.out.println(3);
    }
}
/*OUTPUT:
1
Problem Solved.
3
*/