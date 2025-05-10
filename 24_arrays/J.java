class J {
    public static void main(String[] args) {
        int[] x;

        System.out.println(x[0]);
    }
}
/* compilation error: because a local var. which is inside a method does not get initialized by default value
   and without initializing it, accessing the element gives compilation error.

J.java:5: error: variable x might not have been initialized
        System.out.println(x[0]);
                           ^
1 error
 */