interface X2 {
    int t = 78;
}

class M {
    public static void main(String[] args) {
        System.out.println(X2.t);

        X2.t = 10;

        System.out.println(X2.t);
    }
}
/*
interface variables are implicitly final, and final variables can not be modify.

PS D:\javapractice\13_interface> javac M.java
M.java:9: error: cannot assign a value to final variable t
        X2.t = 10;
          ^
1 error
 */