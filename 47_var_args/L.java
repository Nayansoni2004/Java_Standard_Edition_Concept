class L {
    static void pro(int... x, String y) {

    }
}

/*CONCLUSION:method ki parameter body m agar var_args ellipsis(...) k sath normal parameters bana rhe h to var-args
             ko hamesha last parameter rakhna h.
D:\javaprac\47_var_args>javac L.java
L.java:2: error: varargs parameter must be the last parameter
    static void pro(int... x, String y) {
                           ^
1 error
 */