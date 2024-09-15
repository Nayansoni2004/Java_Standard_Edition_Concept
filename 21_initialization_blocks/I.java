class E1 {
    //programmer supplied(NO PARAMETERIZED)constructor
    E1() {
        System.out.println("S");
    }
    //instance-level initialization block
    {
        System.out.println("Y");
    }
    //static initialization block
    static {
        System.out.println("D");
    }
}

class I extends E1 {
    //instance-level initialization block
    {
        System.out.println("E");
    }
    //static initialization block
    static {
        System.out.println("U");
    }
    //programmer supplied(NO PARAMETERIZED)constructor
    I() {
        System.out.println("W");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("Q");
        I a = new I();
        System.out.println("A");
    }
}
/* OUTPUT: D U Q Y S E W A
class load hote hi class object banega or pahle parent class load hogi then child class hogi,or turant static 
initialization blocks run ho jayenge the,main method se execution start hoga,I()constructor call hoga,or super();
call k through E1()constructor call hoga the,uska super();call complete hote hi instance initialization block 
us instance pr automatic run ho jayenge then E1()constructor ka bacha code run hoga,then I()costructor ka call
resume hoga or instance initialization block us instance pr automatic run ho jayenge,then I()constructor ka 
bacha code run hoga,then main method ka bacha code run hoga or execution end ho jayega. */ 
