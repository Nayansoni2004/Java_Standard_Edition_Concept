class AAA {
    private void pro() {

    }
}

class BBB extends AAA {
    void pro() {

    }
}
/*
happily compiled...
Since overriding method has wider access control (default) then the one applied in the overridden method, so
code is valid.
 */
