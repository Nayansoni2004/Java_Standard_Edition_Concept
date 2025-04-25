class AAA {
    /*private*/ void pro() {

    }
}

class BBB extends AAA {
    static public void pro() {

    }
}
/*
Rule Behind It:
Static methods cannot override instance (non-static) methods, and vice versa.

P1.java:8: error: pro() in BBB cannot override pro() in AAA
    static public void pro() {
                       ^
  overriding method is static
1 error
 */