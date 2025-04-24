class AAA {
    //overridden method version
    private void pro() {

    }
}

class BBB extends AAA {
    //overriding method version
    protected void pro() {

    }
}
/*
happily compiled...
Since overriding method has wider access control (protected) then the one applied in the overridden method as(private)
so code compiles successfully.
 */