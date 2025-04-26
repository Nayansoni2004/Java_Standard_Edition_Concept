class HH {
    static void pro() {

    }
}

class GG extends HH {
    static int pro() {
        return 26;
    }
}

/*
This code gives an error because:
In method hiding (static methods), the method signature must match exactly, including the return type.
In parent HH, pro() returns void, but in child GG, pro() returns int.
That's why Java throws:
"return type int is not compatible with void" error.

R1.java:8: error: pro() in GG cannot hide pro() in HH
    static int pro() {
               ^
  return type int is not compatible with void
1 error
 */