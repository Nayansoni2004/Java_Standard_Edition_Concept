class J1 {
    int pro1() {
        return 1;
    }

    int[] pro2() {
        return null;
    }

    int... pro3() {
        return null;
    }
}
/*OUTPUT: return type m var_args nhi likh sakte h.
D:\javaprac\47_var_args>javac J1.java
J1.java:10: error: <identifier> expected
    int... pro3() {
       ^
J1.java:10: error: invalid method declaration; return type required
    int... pro3() {
           ^
2 errors
 */