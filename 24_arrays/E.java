class E {
    public static void main(String[] args) {
        int[] x = new int[-1];
    }
}

/* compilation successfully done.... but 
Exception at runtime : array cannot be negative

 Exception in thread "main" java.lang.NegativeArraySizeException: -1
        at E.main(E.java:3)
 */