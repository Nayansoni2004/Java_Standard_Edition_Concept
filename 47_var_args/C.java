class C {
    static void pro(int... x) {
        System.out.println("~~~~~");
        //iterating array of primitive-type int through enhanced for loop.
        for(int a : x) 
            System.out.println(a);
    }

    //main method
    public static void main(String[] args) {
        //pro();
        //pro(12);
        //pro(12 , 13);
        //pro(12, 13, 14);
        pro(12, 13, 14 ,15, 16);
    }
}
/*Conclusion:var_args ka use kr k hum method m chahe to no-arguments bhi pass kr sakte h,or single argument bhi
             pass kr sakte h or multiple arguments bhi pass kr sakte h.
OUTPUT:
D:\javaprac\47_var_args>javac C.java

D:\javaprac\47_var_args>java C
~~~~~

D:\javaprac\47_var_args>javac C.java

D:\javaprac\47_var_args>java C
~~~~~
12

D:\javaprac\47_var_args>javac C.java

D:\javaprac\47_var_args>java C
~~~~~
12
13

D:\javaprac\47_var_args>javac C.java

D:\javaprac\47_var_args>java C
~~~~~
12
13
14

D:\javaprac\47_var_args>javac C.java

D:\javaprac\47_var_args>java C
~~~~~
12
13
14
15
16
 */