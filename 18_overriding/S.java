class HH {
    static public void pro() {

    }
}

class GG extends HH {
    static protected void pro() {

    }
}
/*
Rule:
In method hiding (with static methods), you cannot make access more restrictive (narrower) in child class.
It must be same or wider.

S.java:8: error: pro() in GG cannot override pro() in HH
    static protected void pro() {
                          ^
  attempting to assign weaker access privileges; was public
1 error
 */