class AA {
    public void pro() {

    }
}

class BB extends AA {
    void pro() {

    }
}
/*
Note: overridden method ka same access control overriding method m laga sakte h or wider access control apply 
      kr sakte h, but narrower access control nhi laga sakte.
Compilation error:
L1.java:8: error: pro() in BB cannot override pro() in AA
    void pro() {
         ^
  attempting to assign weaker access privileges; was public
1 error
 */