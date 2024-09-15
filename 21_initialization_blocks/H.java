class H {
    //instance-level initialization blocks
    {
        System.out.println("E");
    }

    static {
        System.out.println("L");
    }
    //programmer supplied(NO-PARAMETERIZED)constructor
    H() {
        System.out.println("A");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("R");
        H x = new H();
        System.out.println("B");
    }

    {
        System.out.println("8");
    }
}
/* OUTPUT: L R E 8 A B
H class ka static initialization block class load hone k time pr classobject pr automatic run ho jayega,or 
instance-level initialization blocks H()constructor ka super();call complete hone pr automatic run ho jayenge
then main method ka last statement bacha hua run hoga.
*/