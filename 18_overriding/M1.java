class AAA {
    protected void pro() {

    }
}

class BBB extends AAA {
    void pro() {

    }
}
/*
(public -> protected -> default -> private) This is the wider to narrower order of access controls.
Since in this code the overriding method has narrower access control (default) then the wider access control
(protected) in parent class so compilation fails.

M1.java:8: error: pro() in BBB cannot override pro() in AAA
    void pro() {
         ^
  attempting to assign weaker access privileges; was protected
1 error
 */