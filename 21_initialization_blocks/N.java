class N {
    //static(non-instance)var. member
    static int t = 5;
    //static initialization block
    static {
        System.out.println("E");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("A");
    }
    //static(non-instance level)method
    static void pro() {
        System.out.println("W");
    }
}
/* OUTPUT: E A
N class load hote hi classObject banega or turant us classObject m static variable ko memory allocate hogi or 
explicit value 5 se t var. initialize ho jayega or fir classObject pr static initialization block automatic run 
ho jayega,then main method se execution resume hoga or main method bhi static hoti h to main method bhi classObject
pe register ho jayegi or pro method static mark h to pro bhi classObjecy pe register ho jayegi,then main method
ka next instruction execute hoga or "A" print hoga or execution end ho jayega,var. t or pro method execute nhi
honge kyuki unko main method m call ya access hi nhi kia. */