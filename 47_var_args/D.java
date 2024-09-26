class D {
    static void pro(int... x) {
        System.out.println("~~~~~");
        //iterating array of primitive type int through enhanced-for-loop.
        for(int a : x) 
            System.out.println(a);
    }

    //main method
    public static void main(String[] args) {
        //pro(); <-length=0.
        //pro(12);
        //pro(12, 13);
        //pro(12, 13, 14);
        //pro(12, 13, 14, 15, 16);

        int[] arr = {12, 13, 14, 15, 16, 17, 18, 19};

        pro(arr);
    }
}
/*OUTPUT: var-args internally array create krta h records ka lekin agar hum array khud bana k pass kr de to bhi
          acceptable h,kyuki ab var_args ko array nhi banana padega,automatic internally create ho jata h.
D:\javaprac\47_var_args>javac D.java

D:\javaprac\47_var_args>java D
~~~~~
12
13
14
15
16
17
18
19
 */