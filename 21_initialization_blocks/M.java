class M {
    //static initialization block
    static {
        System.out.println("Hello");
    }
    //main method
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
/* OUTPUT:
Hello
Hi
M class load hote hi classObject bana hoga or turant static initialization block us classobject pr automatic run
ho gya hoga,then main method se execution start hoga or main method bhi us classObject se register ho gya hoga
then,main method ka second instruction run hua hoga,isley pahle Hello print hua then Hi print hua. */