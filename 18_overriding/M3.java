class AAA {
    protected void pro() {

    }
}

class BBB extends AAA {
    public void pro() {

    }
}
/*
happily compiled...
As overriding method has the wider access control then the one applied in the overridden method.
 */