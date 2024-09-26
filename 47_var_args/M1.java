class M1 {
    static void pro(String y, int... x) {
        System.out.println(y);

        System.out.println(x.length);
    }

    //main method
    public static void main(String[] args) {
        pro("mohan");
    }
}
/*OUTPUT:String value->"mohan" normal String parameter y m chala jayega or array bhi create hoga internally 
         var_args banyega but uski length 0 hogi.
D:\javaprac\47_var_args>javac M1.java

D:\javaprac\47_var_args>java M1
mohan
0
 */