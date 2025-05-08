class D {
    public static void main(String[] args) {
        int[] x = new int[0]; //declared array of size zero(0)

        System.out.println(x[0]);
    }
}
/* error because an array object is created but of size 0 so there can't be any element inside it and instead 
 printing it results in successfully compilation but runtime exception.
 
PS D:\github_repos\javapractice\24_arrays> java D
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at D.main(D.java:5)
 */