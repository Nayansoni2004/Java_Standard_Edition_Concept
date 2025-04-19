class Z1 {
    static void pro() {

    }
}

class H1 extends Z1 {
    void pro() {

    }
}
/*
 Static methods belong to the class, not to instances.
So, static methods cannot be overridden by instance methods, and vice versa.

Java throws a compile-time error because we are violating the overriding rules.

D:\github_repos\javapractice\18_overriding> javac H1.java
H1.java:8: error: pro() in H1 cannot override pro() in Z1
    void pro() {
         ^
  overridden method is static
1 error
 */