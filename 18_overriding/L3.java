class AA {
    public void pro() {

    }
}

class BB extends AA {
    public void pro() {

    }
}
/*
happily compiled....
Rule: In overriding the overriding method can have the same or wider access control as defined in the overridden
      method.
 */