class Q {
    static void pro(long... x) {
        //iterating array of long through Enhanced for-loop.
        for(long next : x) 
            System.out.println(next);
    }

    //main method
    public static void main(String[] args) {
        pro('A', 78);//<-internally compiler long type ka array banayega...
    }
}
/*OUTPUT: array of long m array of char obj. or array of int obj. rakh sakte h,legal code h compiler var_args
          dekha kr internally khud hi array of long type ka create kr dega or uski length 2 hogi.
D:\javaprac\47_var_args>javac Q.java

D:\javaprac\47_var_args>java Q
65
78
 */