class E {
    static void pro(int... x) {
        System.out.println(x.length);
    }

    //main method
    public static void main(String[] args) {
        pro(12, 13, 14, 15, 16);
    }
}
/*OUTPUT: hum array ki property length var_args pe call kr sakte h,kyuki var-args bhi ik tarah ka array hi h.
D:\javaprac\47_var_args>javac E.java

D:\javaprac\47_var_args>java E
5
 */