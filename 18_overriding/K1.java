class E2 {
    int pro() {
        return 2;
    }
}

class F1 extends E2 {
    byte pro() {
        byte x = 2;

        return x;
    }
}
/* method overriding says: when overriding a method so return type, parameter body method name must be same as the
                           overridden method.
K1.java:8: error: pro() in F1 cannot override pro() in E2
    byte pro() {
         ^
  return type byte is not compatible with int
1 error
 */