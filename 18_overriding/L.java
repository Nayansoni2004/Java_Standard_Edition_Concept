class AA {
    public void pro() {

    }
}

class BB extends AA {
    private void pro() {

    }
}
/*
In Java, when overriding a method, the access level cannot be more restrictive than the method in the parent class.

output:
L.java:8: error: pro() in BB cannot override pro() in AA
    private void pro() {
                 ^
  attempting to assign weaker access privileges; was public
1 error
 */