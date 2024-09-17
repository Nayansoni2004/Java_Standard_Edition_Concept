class Z1 {
    //static var. member
    static int t = 99;
}

class J extends Z1 {
    //(non-instance-level)var.
    static int t = 88;
    //(non-instance-level)method 
    static void pro() {
        int t = 700; //local variable...
        System.out.println(t);
    }
    //main method
    public static void main(String[] args) {
        pro(); //static method ko main method m direct call kr sakte h,legal h!
    }
}
/* OUTPUT: 700
NOTE: local variables ko static mark nhi kr sakte,kyuki static keyword local variables pr applicable nhi h.kyuki
method k andar ka var. local var. hota h jo ki instance level hota h. */