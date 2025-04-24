class AAA {
    void pro() {

    }
}

class BBB extends AAA {
    private void pro() {

    }
}

/*
compilation faild...
Since overriding method has the narrower access control then the one applied in the overridden method.

N.java:8: error: pro() in BBB cannot override pro() in AAA
    private void pro() {
                 ^
  attempting to assign weaker access privileges; was package
1 error
 */