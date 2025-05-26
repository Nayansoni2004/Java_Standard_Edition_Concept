class H1 {
    public static void main(String[] args) {
        String[][] x = {"om", "ram", "shyam"};//declared 2d array & initializing using super-shortcut technique, direct 1d array.
    }
}
/* compilation error... bec. left side declared 2d array & right side initializing 1d-array so outer 2d-array size is not defined,
  so that compilation fails...
  
PS D:\github_repos\javapractice\25_arrays> javac H1.java
H1.java:3: error: incompatible types: String cannot be converted to String[]
        String[][] x = {"om", "ram", "shyam"};
                        ^
H1.java:3: error: incompatible types: String cannot be converted to String[]
        String[][] x = {"om", "ram", "shyam"};
                              ^
H1.java:3: error: incompatible types: String cannot be converted to String[]
        String[][] x = {"om", "ram", "shyam"};
                                     ^
3 errors
 */