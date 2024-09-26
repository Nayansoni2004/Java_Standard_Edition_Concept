class P {
    static void pro(String[] x, String... y) {
        //iterating array of type String through Enhanced for-loop.
        for(String next : x)
            System.out.println(next + "$$$$$$$$");

        //iterating var_args of type String through Enhanced for-loop.
        for(String next : y)
            System.out.println(next + "!!!!!!!!");
    }

    //main method
    public static void main(String[] args) {
        pro(new String[] {"om", "ram", "dinesh"}, "mike", "john", "relosbo");
    }
}
/*OUTPUT: pro()<-method m as an argument array of String object bana k pass kia h or normal arguments pass kiye 
          h to arrya of String k elements print honge or var_args internally baki elements ka array of String 
          create kr lega or fir var_args k elements print honge.
D:\javaprac\47_var_args>javac P.java

D:\javaprac\47_var_args>java P
om$$$$$$$$
ram$$$$$$$$
dinesh$$$$$$$$
mike!!!!!!!!
john!!!!!!!!
relosbo!!!!!!!!
 */