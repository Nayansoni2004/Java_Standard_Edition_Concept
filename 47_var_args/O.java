class O {
    static void pro(String[] x) {
        //iterating array of type String through Enhanced-for loop.
        for(String next : x) 
            System.out.println(next + "~~~~~~~");
    }

    static void pro(String... x) {
        //iterating array of type String through Enhanced for-loop.
        for(String next : x)
            System.out.println(next + "######");
    }

    //main method
    public static void main(String[] args) {
        String[] arr = {"om" , "jay" , "ram"};

        pro(arr);
    }
}
/*OUTPUT: var_args bhi array ki tarah hi h to hum same name se multiple method kisi class m declare nhi kr sakte.
          bec. acc. to rule multiple method with the same name in as class is not allowed.

          D:\javaprac\47_var_args>javac O.java
O.java:8: error: cannot declare both pro(String...) and pro(String[]) in O
    static void pro(String... x) {
                ^
1 error
 */