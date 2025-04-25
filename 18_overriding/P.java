class AAA {
    /*private*/ void pro() {

    }
}

class BBB extends AAA {
    public int pro() {
        return 2;
    }
}
/*
code give compilation error because overriding rule says the return type of overridden method & overriding method
must be same. when the pro() was private in AAA so, it wasn't accessible in BBB so there was no overriding but,
in this case pro has default(package level) access, so its accessible in BBB and BBB has pro() returning int,
thats, why compiler gives error.
P.java:8: error: pro() in BBB cannot override pro() in AAA
    public int pro() {
               ^
  return type int is not compatible with void
1 error
 */