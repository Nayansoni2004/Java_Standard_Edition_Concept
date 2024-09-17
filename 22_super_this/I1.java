class Y1 {
    //instance-level var.
    private int x = 99; //parent class ka instance var.
    //instance-level method
    void pro() {
        System.out.println(x);
        abc();
    }
    //instance-level method
    private void abc() {
        System.out.println("Hi");
    }
}

class I1 extends Y1 {
    //instance-level var.
    int x = 66; //child class ka instance var.
    //instance-level method
    void info() {
        int x = 22; //local var.

        System.out.println(x);
        System.out.println(this.x);
        //System.out.println(super.x); error: x has private access in Y1
        pro();   
        //abc();  error: cannot find symbol
    }
    //main method
    public static void main(String[] args) {
        I1 i = new I1();
        i.info();
    }
}
/* OUTPUT: 
22
66
99
Hi
class ka private member kewal apni class k andar accessible hota h,isley I1 class m access krne k liye humne un
private members ko Y1 class m hi default access method k andar access kia or I1 class ki method k andar us default
access control wali method ko call kia to wo Y1 class k private member bhi I1 class m access ho gye... */