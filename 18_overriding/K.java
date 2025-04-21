class E2 {
    void pro() {

    }
}

class F1 extends E2 {
    int pro() {
        return 2;
    } 
}
/*
Overriding rule says: overriding is multiple methods with the same name & parameter body must match & also return
                       type should also match.
K.java:8: error: pro() in F1 cannot override pro() in E2
    int pro() {
        ^
  return type int is not compatible with void
1 error
 */