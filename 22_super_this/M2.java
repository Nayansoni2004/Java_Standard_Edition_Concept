class W1 {
    //over-ridden method
    static void pro() {
        System.out.println("pro in parent***");
    }
}

class M2 extends W1 {
    //over-riding method
    static void pro() {
        System.out.println("pro in child###");
    }
    //instance-level method 
    void aaa() {
        pro();
        this.pro();  //instance-level method k andar "this" keyword likh sakte h,legal h.
        M2.pro();    //classname dot membername likh k bhi call kr sakte h..
        super.pro(); //instance-level method k andar "super" keyword likh sakte h,legal h.
        W1.pro();    //classname dot membername likh k bhi call kr sakte h..
    }
    //main method
    public static void main(String[] args) {
        M2 x = new M2();

        x.aaa();  //method call...
    }
}
/* OUTPUT: 
pro in child###
pro in child###
pro in child###
pro in parent***
pro in parent***

instance-level method k andar parent class or child class k static memebers ko "this" or "super" keyword ka use
kr k bhi call kr sakte h or classname dot membername likh k bhi call kr sakte h,dono ways correct h.  */ 