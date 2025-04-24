class AAA {
    protected void pro() {

    }
}

class BBB extends AAA {
    private void pro() {

    }
}
/*
compilation error.... In this code the narrower access control is applied to the overriding method, because private is more
                      narrower than the protected applied in the overridden method. 
M.java:8: error: pro() in BBB cannot override pro() in AAA
    private void pro() {
                 ^
  attempting to assign weaker access privileges; was protected
1 error
 */