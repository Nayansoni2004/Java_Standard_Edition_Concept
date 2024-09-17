class Z1 {
    //(non-instance-level)variable
    static int t = 90;
}

class K2 extends Z1 {
    //(non-instance-level)variable
    static int t = 70;
    //instance-level method
    void pro() {
        int t = 1000;
        System.out.println(t);
        System.out.println(this.t);  //this ki jagah compiler K2 likh deta h.
        System.out.println(super.t); //super ki jagah compiler Z1 likh dega.kyuki method instance-level h.
    }
    //main method
    public static void main(String[] args) {
        K2 x = new K2(); //pro cannot be directly called bec. pro method is instance-level.
        x.pro();
    }
}
/* OUTPUT: 
1000
70
90
kyuki method instance-level h isley compiler hamare behalf me this ki jagah K2 likh dega or super ki jagah Z1 
likh dega to child or parent class ka instance var. call ho jayega,or kyuki method instance-level h isley
main method k andar usko direct call nhi kr sakte to object bana k call kr lia. */