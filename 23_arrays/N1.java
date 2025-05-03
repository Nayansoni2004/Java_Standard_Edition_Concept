class N1 {
    public static void main(String[] args) {
        float[] x;

        x = {0.2f, 0.3f, 0.5f};

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}
/*
error : because super shortcut technique of array declaration cum instantiation cum initialization can be only
        done at the time of array declaration, but in this code after declaration array is getting initialized 
        using super shortcut which is not valid syntax rules.

PS D:\github_repos\javapractice\23_arrays> javac N1.java
N1.java:5: error: illegal start of expression
        x = {0.2f, 0.3f, 0.5f};
            ^
N1.java:5: error: not a statement
        x = {0.2f, 0.3f, 0.5f};
             ^
N1.java:5: error: ';' expected
        x = {0.2f, 0.3f, 0.5f};
                 ^
3 errors
 */