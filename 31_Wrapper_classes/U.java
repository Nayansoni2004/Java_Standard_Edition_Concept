class U {
    //main method
    public static void main(String[] args) {
        float a = 2.3f;

        String x = a.toString();

        System.out.println(x);
    } 
}
/* OUTPUT:
U.java:6: error: float cannot be dereferenced
        String x = a.toString();
                    ^
1 error
*/