class K {
    K(int... x) {//<-internally,array of type int create hoga...
        //iterating array of type int through Enhanced-for loop.
        for(int j : x)
            System.out.println(j);
    }

    //main method
    public static void main(String[] args) {
        K y = new K({12, 45, 67, 23});
    }
}
/*CONCLUSION:hum super-short-cut technique se array bana rhe h or direct constructor ki parameter body m pass kr
             rhe h,to error aayega kyuki constructor jese hi object ko initialize krne k liye call hoga or usme
             hum ne direct array pass kia h,jubki hume array object bana k pass krna padega,see next example...

D:\javaprac\47_var_args>javac K.java
K.java:9: error: illegal start of expression
        K y = new K({12, 45, 67, 23});
                    ^
K.java:9: error: illegal start of type
        K y = new K({12, 45, 67, 23});
                     ^
K.java:9: error: ';' expected
        K y = new K({12, 45, 67, 23});
                                    ^
3 errors
*/