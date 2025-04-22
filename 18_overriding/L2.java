class AA {
    public void pro() {

    }
}

class BB extends AA {
    protected void pro() {

    }
}
/*
[Access Modifier Rule] Overriding method must not reduce access; protected is narrower than public

L2.java:8: error: pro() in BB cannot override pro() in AA
    protected void pro() {
                   ^
  attempting to assign weaker access privileges; was public
1 error
 */