class J {
    int x;
    int[] y;
    int... z;
}

/*Conclusion: var_args ko kewal parameter body m likh sakte h,or parameter body kewal method() or constructor()
              ki hoti h,or kahi likhenge to compilation fail ho jayega.
D:\javaprac\47_var_args>javac J.java
J.java:4: error: <identifier> expected
    int... z;
       ^
J.java:4: error: <identifier> expected
    int... z;
            ^
2 errors
 */