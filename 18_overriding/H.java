class Z {
    void pro() {

    }
}

class H extends Z {
    static void pro() {

    }
}

/*
Java doesn’t allow overriding a non-static method with a static one, and vice versa.

D:\github_repos\javapractice\18_overriding> javac H.java
H.java:8: error: pro() in H cannot override pro() in Z
    static void pro() {
                ^
  overriding method is static
1 error
 */